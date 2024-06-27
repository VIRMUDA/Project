package com.demo_virmuda.auth;

public interface ResponseCode {
	
	// 200
	String SUCCESS = "SU";
	
	// 400
	String VALIDATION_FAILED = "VF";
	String DUPLICATE_EMAIL = "DE";
	String DUPLICATE_USERNAME = "DU";
	String NOT_EXISTED_USER = "NU";
	String NOT_EXISTED_BOARD = "NB";
	
	// 401
	String LOG_IN_FAIL = "LF";
	String AUTHORIZATION_FAIL = "AF";
	
	//403
	String NO_PERMISSION = "NP";
	
	//500
	String DATABASE_ERROR = "DBE";
}
