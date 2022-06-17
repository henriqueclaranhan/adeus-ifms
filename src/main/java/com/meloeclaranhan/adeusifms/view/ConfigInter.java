package com.meloeclaranhan.adeusifms.view;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

@Configuration
public class ConfigInter implements WebMvcConfigurer {
	@Bean
	public MessageSource messageSource() { 
		ReloadableResourceBundleMessageSource messageSource = 
			new ReloadableResourceBundleMessageSource();

		messageSource.setBasename("classpath:/messages/data");
		messageSource.setDefaultEncoding("UTF-8");

		return messageSource;
	}

	@Bean
	public LocaleResolver  localeResolver() {
		CookieLocaleResolver  clr = new CookieLocaleResolver(); 
		clr.setDefaultLocale(Locale.ENGLISH);
		return clr;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor(); 
		interceptor.setParamName("locale");
		registry.addInterceptor(interceptor);
	}
}
