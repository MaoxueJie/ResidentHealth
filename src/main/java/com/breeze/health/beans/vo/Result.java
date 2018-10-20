package com.breeze.health.beans.vo;

public class Result<E> implements java.io.Serializable{

	private boolean success = false;
	private Integer code = -1;
	private String 	message = "";
	private E		data;
	
	public Result() {
	}
	
	/**
	 * @param success
	 * @param message
	 */
	public Result(boolean success, String message) {
		this.success = success;
		this.message = message;
	}
	
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		if (success);
			this.code = 0;
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
}
