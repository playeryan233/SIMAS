package com.simas.config.security;

import com.simas.util.JWTUtil;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.constraints.NotNull;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class JwtAuthenticationFilter extends OncePerRequestFilter {
    // https://developer.aliyun.com/article/1341764#slide-2

    private final JWTUtil jwtUtil;
    private final UserDetailsService userDetailsService;

    @Override
    protected void doFilterInternal(@NonNull HttpServletRequest request,
                                    @NotNull HttpServletResponse response,
                                    @NonNull FilterChain filterChain)
            throws ServletException, IOException {
        //判断请求是否为登录请求，如果是登录请求则不进行处理
        if (request.getServletPath().contains("/auth")) {
            filterChain.doFilter(request, response);
            return;
        }
        //从请求头中获取鉴权authHeader
        final String authHeader = request.getHeader("Authorization");
        final String jwt;
        final String username;
        //如果不存在Token或者Token不已Bearer开头，则不进行处理
        if (authHeader == null ||!authHeader.startsWith("Bearer ")) {
            filterChain.doFilter(request, response);
            return;
        }
        //从authHeader中截取出Token信息
        jwt = authHeader.substring(7);
        //从Token中获取userEmail(账户)
        username = jwtUtil.extractUsername(jwt);
        //SecurityContextHolder 中的 Authentication 为空时，才进行处理
        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
            //获取用户信息
            UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
            // TODO 从Reid中取出token进行校验替换上述从数据库进行校验，某种方式更改用户上线信息，从Redis中检查是否上线
            //如果Token有效,并且Token状态正常,将用户信息存储到SecurityContextHolder
            if (jwtUtil.isValid(jwt, userDetails)) {
                UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(
                        userDetails, //用户信息
                        null,
                        userDetails.getAuthorities() //用户的权限
                );
                authToken.setDetails(
                        new WebAuthenticationDetailsSource().buildDetails(request) //访问信息
                );
                //将用户信息以及权限保存到 SecurityContextHolder的上下文中,方便后续使用
                //eg: 获取当前用户id,获取当前用户权限等等
                SecurityContextHolder.getContext().setAuthentication(authToken);
            } else {
                throw new RuntimeException("Token is not valid or expired");
            }
        }
        filterChain.doFilter(request, response);
    }
}
