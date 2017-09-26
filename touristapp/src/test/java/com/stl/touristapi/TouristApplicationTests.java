package com.stl.touristapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.stl.touristapp.ServletInitializer;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServletInitializer.class)
@WebAppConfiguration
public class TouristApplicationTests {

	@Test
	public void contextLoads() {
	}

}
