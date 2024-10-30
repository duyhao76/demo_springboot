package vn.DuyHao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import vn.DuyHao.configs.MySiteMeshFilter;

@SpringBootApplication
public class DemoSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringbootApplication.class, args);
	}
	
	@Bean
	public FilterRegistrationBean<MySiteMeshFilter> siteMeshFilter() {
		FilterRegistrationBean<MySiteMeshFilter> filterRegistrationBean = new FilterRegistrationBean<MySiteMeshFilter>();
		filterRegistrationBean.setFilter(new MySiteMeshFilter());
		filterRegistrationBean.addUrlPatterns("/*");
		
		return filterRegistrationBean;
	}
}
