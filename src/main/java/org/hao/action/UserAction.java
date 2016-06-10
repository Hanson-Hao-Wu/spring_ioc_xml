package org.hao.action;

import org.hao.model.User;
import org.hao.service.IUserService;

public class UserAction {

	private User user;
	private IUserService userService;
	private int id;
	
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public IUserService getUserService() {
		return userService;
	}
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
	public void add(){
		System.out.println("UserAction: add : ");
		userService.add(user);
	}
	public void delete() {
		System.out.println("UserAction: delete id: " + id);
		userService.delete(id);
	}
	public void load() {
		System.out.println("UserAction: load id: " + id);
		userService.load(id);
	}
	
	
}
