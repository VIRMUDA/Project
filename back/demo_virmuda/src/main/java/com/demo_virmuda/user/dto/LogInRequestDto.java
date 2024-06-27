package com.demo_virmuda.user.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LogInRequestDto {
	
	private String email;
	private String password;
}
