package com.demo_virmuda.user.dto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.demo_virmuda.auth.ResponseCode;
import com.demo_virmuda.auth.ResponseMessage;

import lombok.Getter;

@Getter
public class LogInResponseDto extends ResponseDto {
	
	private String token;
	private int expirationTime;
	
	private LogInResponseDto(String token) {
		super(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
		this.token = token;
		this.expirationTime = 3600;
	}
	
	public static ResponseEntity<LogInResponseDto> succeess(String token) {
		LogInResponseDto result = new LogInResponseDto(token);
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	public static ResponseEntity<ResponseDto> logInFail() {
		ResponseDto result = new ResponseDto(ResponseCode.LOG_IN_FAIL, ResponseMessage.LOG_IN_FAIL);
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(result);
	}
}
