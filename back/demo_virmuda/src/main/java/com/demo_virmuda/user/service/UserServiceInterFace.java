package com.demo_virmuda.user.service;

import org.springframework.http.ResponseEntity;

import com.demo_virmuda.user.dto.LogInRequestDto;
import com.demo_virmuda.user.dto.LogInResponseDto;
import com.demo_virmuda.user.dto.SignUpRequestDto;
import com.demo_virmuda.user.dto.SignUpResponseDto;

public interface UserServiceInterFace {
	ResponseEntity<? super SignUpResponseDto> signUp(SignUpRequestDto dto);
	ResponseEntity<? super LogInResponseDto> logIn(LogInRequestDto dto);
}
