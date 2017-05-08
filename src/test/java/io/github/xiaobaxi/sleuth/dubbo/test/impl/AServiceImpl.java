package io.github.xiaobaxi.sleuth.dubbo.test.impl;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author fangzhibin
 *
 */
public class AServiceImpl implements AService {
	@Autowired
	BService bService;

	public void test() {
		System.out.println("AService.test()");
		bService.test();
	}
}
