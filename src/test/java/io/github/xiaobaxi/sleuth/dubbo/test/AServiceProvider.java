package io.github.xiaobaxi.sleuth.dubbo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 
 * @author fangzhibin
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(properties = { "spring.application.name=AServiceProvider" })
@ContextConfiguration(locations = {"classpath:AServiceProvider-context.xml"}, classes = SleuthBootstrap.class)
public class AServiceProvider {

	@Test
	public void test() {
		try {
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
