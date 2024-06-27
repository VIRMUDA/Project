package com.demo_virmuda.user.service;

//import java.util.Optional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.demo_virmuda.auth.JwtTokenProvider;
import com.demo_virmuda.user.dto.ResponseDto;
import com.demo_virmuda.user.dto.SignUpRequestDto;
import com.demo_virmuda.user.dto.SignUpResponseDto;
import com.demo_virmuda.user.dto.LogInRequestDto;
import com.demo_virmuda.user.dto.LogInResponseDto;
import com.demo_virmuda.user.entity.User;
import com.demo_virmuda.user.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService implements UserServiceInterFace {
	
	private final UserRepository userRepository;
	private final JwtTokenProvider jwtTokenProvider;

	private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
	@Override
	public ResponseEntity<? super SignUpResponseDto> signUp(SignUpRequestDto dto) {
		
		try {
			
			String email = dto.getEmail();
			boolean existedEmail = userRepository.existsByEmail(email);
			if (existedEmail) return SignUpResponseDto.duplicateEmail();
			
			String username = dto.getUsername();
			boolean existedUsername = userRepository.existsByUsername(username);
			if (existedUsername) return SignUpResponseDto.duplicateUsername();
			
			String password = dto.getPassword();
			String encodedPassword = passwordEncoder.encode(password);
			dto.setPassword(encodedPassword);
			
			User user = new User(dto);
			userRepository.save(user);
			
		} catch (Exception exception) {
			exception.printStackTrace();
			return ResponseDto.databaseError();
		}
		return SignUpResponseDto.success();
	}

	@Override
	public ResponseEntity<? super LogInResponseDto> logIn(LogInRequestDto dto) {
		
		String token = null;
		
		try {
			
			String email = dto.getEmail();
			User user = userRepository.findByEmail(email);
			if (user == null) return LogInResponseDto.logInFail();
			
			String password = dto.getPassword();
			String encodedPassword = user.getPassword();
			boolean isMatched = passwordEncoder.matches(password, encodedPassword);
			if (!isMatched) return LogInResponseDto.logInFail();
			
			token = jwtTokenProvider.create(email);
			
		} catch (Exception exception) {
			exception.printStackTrace();
			return ResponseDto.databaseError();
		}
		
		return LogInResponseDto.succeess(token);
	}
	
	
//	public UserResponse.Result delete() {
//		userRepository.delete(getCurrentUser());
//		return UserResponse.Result.builder()
//				.result("success")
//				.message("회원 탈퇴 완료").build();
//	}
//	
//	public User getCurrentUser() {
//		String id = SecurityContextHolder.getContext().getAuthentication().getName();
//		return userRepository.findByusername(id).orElseThrow();
//	}
//	
//	public UserResponse.Result logout() {
//		redisTemplate.delete(getCurrentUser().getId().toString());
//		return UserResponse.Result.builder()
//				.result("successs")
//				.message("로그아웃 완료").build();
//	}

}
