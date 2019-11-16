package com.fanqie.srpingboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
public class SrpingbootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrpingbootWebApplication.class, args);
	}



	public static class MyViewResoler implements ViewResolver{

		@Nullable
		@Override
		public View resolveViewName(String s, Locale locale) throws Exception {
			return null;
		}
	}

}
