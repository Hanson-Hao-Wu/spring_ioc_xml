package org.hao.dao;

import org.hao.model.User;

public class UserDao implements IUserDao {

	@Override
	public void add(User user) {
		System.out.println("UserDao: add : " + user);
	}

	@Override
	public void delete(int id) {
		System.out.println("UserDao: delete user id : " + id);
	}

	@Override
	public User load(int id) {
		System.out.println("UserDao: load user id : " + id);
		return null;
	}

}
