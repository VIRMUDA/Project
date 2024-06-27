package com.demo_virmuda.auth;

public interface ResponseMessage {

	// 200
	String SUCCESS = "Success";
	
	// 400
	String VALIDATION_FAILED = "Validation failed";
	String DUPLICATE_EMAIL = "Duplicate email";
	String DUPLICATE_USERNAME = "Duplicate username";
	String NOT_EXISTED_USER = "This user does not exist";
	String NOT_EXISTED_BOARD = "This board does not exist";
	
	// 401
	String LOG_IN_FAIL = "Login information mismatch";
	String AUTHORIZATION_FAIL = "Authorization Failed";
	
	//403
	String NO_PERMISSION = "dont have permission";
	
	//500
	String DATABASE_ERROR = "Database error";
}
