package com.demo_virmuda.user.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SignUpRequestDto {
	
	// @NotBlank, @Email, @Size, @NotNull 필요에 따라 추가 
	private String email;
//	private String nickname;
	private String username;
	private String password;
}
