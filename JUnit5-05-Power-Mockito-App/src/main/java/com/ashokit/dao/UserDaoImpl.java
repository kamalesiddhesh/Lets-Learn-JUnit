package com.ashokit.dao;

public class UserDaoImpl implements UserDao{

	public String findNameById(Integer id) {
		System.out.println("findNameByID() called ");
		return "John";
	}

	public String findEmailById(Integer id) {
		System.out.println("findEmailByID() called ");
		return "john@gmail.com";
	}

}
