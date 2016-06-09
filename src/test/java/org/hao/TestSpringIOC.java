package org.hao;

import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringIOC {

	private BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");

	@Test
	public void testHelloWorld() {
		HelloWorld hello = (HelloWorld)factory.getBean("helloWorld",HelloWorld.class);
		System.out.println(hello.hello());
		assertEquals("Hello World", hello.hello());
	}

}
