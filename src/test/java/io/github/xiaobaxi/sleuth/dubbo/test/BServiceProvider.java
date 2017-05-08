package io.github.xiaobaxi.sleuth.dubbo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * idea默认的xml会到classpath目录下的，所以需要指定加载locations
 * eclipse操蛋的，默认会加载当前目录的BServiceProvider-context.xml文件，classpath下加载不了，不知道为什么
 * @author fangzhibin
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(properties = { "spring.application.name=BServiceProvider" })
@ContextConfiguration(locations = {"classpath:BServiceProvider-context.xml"}, classes = SleuthBootstrap.class)
public class BServiceProvider {

	@Test
	public void test() {
		try {
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
