package com.swd.webservice.common.utils;

import java.util.Locale;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring容器工具
 * 
 * @author luohj
 * 
 */
public class SpringContextUtil implements ApplicationContextAware {
	private static ApplicationContext context = null;

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		context = applicationContext;
	}

	public static <T> T getBean(String beanName) {
		return (T) context.getBean(beanName);
	}

	public static String getMessage(String key) {
		return context.getMessage(key, null, Locale.getDefault());
	}
}