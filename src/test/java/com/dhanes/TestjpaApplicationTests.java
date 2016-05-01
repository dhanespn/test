package com.dhanes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.dhanes.config.TestjpaApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestjpaApplication.class)
@WebAppConfiguration
public class TestjpaApplicationTests {

	@Test
	public void contextLoads() {
	}

}
