package com.resmia.utils;

public class MyResponse {
	private String message;
	private int status;
	private Object data;
	
	public MyResponse(int staus, String mesage, Object data) {
		this.message = mesage;
		this.status = staus;
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
