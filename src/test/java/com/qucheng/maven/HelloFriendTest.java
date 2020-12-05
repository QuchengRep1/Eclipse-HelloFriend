package com.qucheng.maven;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import com.qucheng.maven.Hello;

public class HelloFriendTest {
	@Test
	public void testHelloFriend() {
		HelloFriend helloFriend = new HelloFriend();
		String results = helloFriend.sayHelloToFriend("litingwei");
		assertEquals("Hello litingwei! I am John",results);
	}
}

