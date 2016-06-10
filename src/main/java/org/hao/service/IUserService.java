package org.hao.service;

import org.hao.model.User;

public interface IUserService {

	public void add(User user);
	public void delete(int id);
	public User load(int id);
}
