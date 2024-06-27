package com.demo_virmuda.user.controller;


import javax.validation.Valid;

//import org.springframework.http.HttpStatus;
//import org.springframework.validation.annotation.Validated;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo_virmuda.user.dto.SignUpRequestDto;
import com.demo_virmuda.user.dto.SignUpResponseDto;
import com.demo_virmuda.user.dto.LogInRequestDto;
import com.demo_virmuda.user.dto.LogInResponseDto;
import com.demo_virmuda.user.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userService;
	
	@PostMapping("/signup")
	public ResponseEntity<? super SignUpResponseDto> signup(
			@RequestBody @Valid SignUpRequestDto requestBody
	) {
		ResponseEntity<? super SignUpResponseDto> response = userService.signUp(requestBody);
		return response;
	}
	
	@PostMapping("/login")
	public ResponseEntity<? super LogInResponseDto> logIn(
			@RequestBody @Valid LogInRequestDto requestBody
	) {
		ResponseEntity<? super LogInResponseDto> response = userService.logIn(requestBody);
		return response;
	}
	
	
//	@PostMapping("/login")
//	public ResponseEntity<?> login(@RequestBody UserRequest.Login loginDto) {
//		return new ResponseEntity<UserResponse.Token>(userService.login(loginDto), HttpStatus.OK);
//	}
	
	
//	@PostMapping("/delete")
//	public ResponseEntity<?> deleteUser() throws Exception {
//		return new ResponseEntity<UserResponse.Result>(userService.delete(), HttpStatus.OK);
//	}
//	
//	@PostMapping("/logout")
//	public ResponseEntity<?> logout() throws Exception {
//		return new ResponseEntity<UserResponse.Result>(userService.logout(), HttpStatus.OK);
//	}

}
