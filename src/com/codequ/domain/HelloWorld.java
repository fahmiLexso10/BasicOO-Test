package com.codequ.domain;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "helloWorld", eager = true)
@RequestScoped
public class HelloWorld {

	@ManagedProperty(value = "#{message}")
	private Message messageBean;
	
	private String message;

	public HelloWorld() {
		System.out.println("HelloWorld started!");
	}

	public String getMessage() {
		if (messageBean != null) {
			message = messageBean.getMessage();
		}
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public Message getMessageBean() {
		return messageBean;
	}

	public void setMessageBean(Message messageBean) {
		this.messageBean = messageBean;
	}
	
	
}
