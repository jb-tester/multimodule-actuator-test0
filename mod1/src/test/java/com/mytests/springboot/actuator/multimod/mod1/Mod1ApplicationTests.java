package com.mytests.springboot.actuator.multimod.mod1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Mod1ApplicationTests {

	@Autowired
	private AlarmIndicator alarmIndicator;

	@Test
	public void contextLoads() {
		System.out.println("passed!!!");
	}

	@Test
	public void testAlarmIndicator() {
		String ai = alarmIndicator.health().getStatus().toString();
		Assert.assertEquals("UP",ai );
	}
}
