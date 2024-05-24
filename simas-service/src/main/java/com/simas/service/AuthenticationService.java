package com.simas.service;

import com.simas.domain.dto.UserLoginDTO;
import com.simas.domain.dto.UserRegisterDTO;
import com.simas.domain.resp.Result;

import java.util.Map;

public interface AuthenticationService {

    Result<String> register(UserRegisterDTO userRegisterDTO);

    Result<String> authenticate(UserLoginDTO userLoginDTO);
}
