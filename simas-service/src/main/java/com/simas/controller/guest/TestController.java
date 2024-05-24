package com.simas.controller.guest;


import com.simas.domain.dto.UserLoginDTO;
import com.simas.domain.resp.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
@Tag(name = "测试接口")
public class TestController {

    @GetMapping("/test")
    @Operation(summary = "测试sum", description = "测试des")
    public Result<UserLoginDTO> test(){
        UserLoginDTO userDTO = UserLoginDTO.builder()
                .username("yzc")
                .password("123456")
                .build();
        return Result.success(userDTO);
    }

    @GetMapping("/testauth")
    @Operation(summary = "测试sum", description = "测试des")
    public Result<UserLoginDTO> testauth(){
        UserLoginDTO userDTO = UserLoginDTO.builder()
                .username("yzc")
                .password("123456")
                .build();
        return Result.success(userDTO);
    }
}
