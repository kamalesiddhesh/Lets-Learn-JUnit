package com.ashokit.service;

import com.ashokit.dao.UserDao;

public class UserService {
	
	private UserDao dao;
	
	public UserService() {
		
	}
	
	public UserService(UserDao dao) {
		this.dao = dao;		
	}
	
	public String getNameByUserId(Integer id) {
		String name = dao.findNameById(id);
		return name;
	}
	
	public String getEmailByUserId(Integer id) {
		String email = dao.findEmailById(id);
		return email;
	}
	
	public String doWork(String msg) {
		String formattedString = formatMsg(msg);
		return formattedString;
	}
	
	private String formatMsg(String msg) {  // private Method
		return msg.toUpperCase();
	}
	
	public void doProcess() {
		System.out.println("doProcess() method started");
		pushMsgToKafkaTopic("msg");
		System.out.println("doProcess() method ended");
	}

	public void pushMsgToKafkaTopic(String string) {
		System.out.println("msg pushing to kafka.....");
		
	}
	

}
