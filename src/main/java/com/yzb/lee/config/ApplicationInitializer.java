package com.yzb.lee.config;

import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

public class ApplicationInitializer extends
		AbstractHttpSessionApplicationInitializer {
	
	public ApplicationInitializer() {
        System.out.println("init");
	}
}
