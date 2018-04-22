package com.icore.office.domin;

public class ErrorResponse {
	private int errorCode;
	private String message;
	
	public ErrorResponse(){
		super();
	}
	
	public ErrorResponse(int errorCode, String message){
		this.errorCode = errorCode;
		this.message = message;
	}
	
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ErrorResponse [errorCode=" + errorCode + ", message=" + message + "]";
	}
	
	

}
