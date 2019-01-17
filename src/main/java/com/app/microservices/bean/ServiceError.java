package com.app.microservices.bean;

import java.util.Date;

public class ServiceError {
	private String message;
	private String errorCode;
	private Date dateCreated;

	public ServiceError() {
	}

	public ServiceError(String message, String errorCode) {
		this.message = message;
		this.errorCode = errorCode;
		this.dateCreated = new Date();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
}
