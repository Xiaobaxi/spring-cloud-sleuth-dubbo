package io.github.xiaobaxi.sleuth.dubbo.test;

import io.github.xiaobaxi.sleuth.dubbo.test.impl.AService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 
 * @author fangzhibin
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(properties = { "spring.application.name=AServiceConsumer" })
@ContextConfiguration(locations = {"classpath:AServiceConsumer-context.xml"}, classes = SleuthBootstrap.class)
public class AServiceConsumer {

	@Autowired
	AService aService;

	@Test
	public void test() {
		try {
			aService.test();
			System.in.read();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
