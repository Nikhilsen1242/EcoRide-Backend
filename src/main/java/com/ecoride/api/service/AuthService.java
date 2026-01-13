package com.ecoride.api.service;

import com.ecoride.api.dto.JwtResponse;
import com.ecoride.api.dto.LoginRequest;
import com.ecoride.api.entity.User;

public interface AuthService {
    String registerUser(User user);
    JwtResponse authenticateUser(LoginRequest loginRequest);
}