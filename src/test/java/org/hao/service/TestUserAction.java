package org.hao.service;

import org.hao.action.UserAction;
import org.hao.model.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserAction {

	private BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
	@Test
	public void testIoC() {
		UserAction ua = factory.getBean("userAction", UserAction.class);
		User u = new User(1, "wuhao");
		ua.setUser(u);
		ua.add();
	}

}
