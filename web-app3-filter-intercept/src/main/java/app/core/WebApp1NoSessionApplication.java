package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import app.core.filters.LoginFilter;
import app.core.session.SessionContext;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class WebApp1NoSessionApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApp1NoSessionApplication.class, args);
	}

	@Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build();
	}

	@Bean
	public FilterRegistrationBean<LoginFilter> filterRegistration(SessionContext sessionContext) {
		FilterRegistrationBean<LoginFilter> filterRegistrationBean = new FilterRegistrationBean<>();
		LoginFilter loginFilter = new LoginFilter(sessionContext);
		filterRegistrationBean.setFilter(loginFilter);
		filterRegistrationBean.addUrlPatterns("/api/*");
		return filterRegistrationBean;

	}

}
