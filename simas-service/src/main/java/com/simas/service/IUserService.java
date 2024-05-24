package com.simas.service;

import com.simas.domain.dto.UserInfoDTO;
import com.simas.domain.dto.UserRegisterDTO;
import com.simas.domain.po.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.simas.domain.resp.Result;
import com.simas.domain.vo.UserVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yzc
 * @since 2024-05-20
 */
public interface IUserService extends IService<User> {
    /**
     * 查询指定用户信息
     * @param id
     * @return
     */
    Result<UserVO> info(Long id);

    /**
     * 获取当前用户信息
     * @return
     */
    Result<UserVO> me();

    /**
     * 修改用户信息
     * @param userInfoDTO
     * @return
     */
    Result updateUser(UserInfoDTO userInfoDTO);

    /**
     * 注销当前用户
     * @return
     */
    Result deleteMe();
}
