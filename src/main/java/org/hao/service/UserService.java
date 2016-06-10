package org.hao.service;

import org.hao.dao.IUserDao;
import org.hao.model.User;

public class UserService implements IUserService {

	private IUserDao userDao;
	
	
	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		System.out.println("UserService: add : " + user);
		userDao.add(user);
	}

	@Override
	public void delete(int id) {
		System.out.println("UserService: delete id: " + id);
		userDao.delete(id);
	}

	@Override
	public User load(int id) {
		System.out.println("UseUserServicerDao: load id: " + id);
		return userDao.load(id);
	}

}
