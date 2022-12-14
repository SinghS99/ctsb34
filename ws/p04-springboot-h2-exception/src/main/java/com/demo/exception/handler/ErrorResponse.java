package com.demo.exception.handler;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class ErrorResponse{
	private String message;
	private String type;
	private LocalDateTime now;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LocalDateTime getNow() {
		return now;
	}
	public void setNow(LocalDateTime now) {
		this.now = now;
	}
	@Override
	public String toString() {
		return "ErrorResponse [message=" + message + ", type=" + type + ", now=" + now + "]";
	}
	public ErrorResponse(String message, String type) {
		super();
		this.message = message;
		this.type = type;
		this.now = LocalDateTime.now();
	}
	
	
}

