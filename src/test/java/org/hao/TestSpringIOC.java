package org.hao;

import static org.junit.Assert.*;

import org.hao.model.HelloWorld;
import org.junit.Ignore;
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
	
	@Test
	@Ignore
	public void testSingleton() {
		/*when use default scope: singleton*/
		HelloWorld hello1 = (HelloWorld)factory.getBean("helloWorld",HelloWorld.class);
		HelloWorld hello2 = (HelloWorld)factory.getBean("helloWorld",HelloWorld.class);
		
		assertSame(hello1, hello2);
	}
	
	@Test
	public void testPrototype() {
		HelloWorld hello1 = (HelloWorld)factory.getBean("helloWorld",HelloWorld.class);
		HelloWorld hello2 = (HelloWorld)factory.getBean("helloWorld",HelloWorld.class);

		//assertArrayEquals(false, (hello1==hello2));
		System.out.println(hello1==hello2);
	}

}
