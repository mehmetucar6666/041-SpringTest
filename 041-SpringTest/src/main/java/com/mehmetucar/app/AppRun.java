package com.mehmetucar.app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mehmetucar.memur.Memur;

public class AppRun {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext appContext = new ClassPathXmlApplicationContext("SpringBeansConfiguration.xml");
		
		appContext.start();
		appContext.refresh();
		
		Memur memur = appContext.getBean("memurBean", Memur.class);
		memur.calis();
		
		appContext.stop();
		appContext.close();

	}

}
