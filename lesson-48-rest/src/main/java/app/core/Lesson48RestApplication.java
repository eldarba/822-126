package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

// swagger link
// http://localhost:8080/swagger-ui.html

@SpringBootApplication
@EnableSwagger2
public class Lesson48RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lesson48RestApplication.class, args);
	}

	// configure what services are exposed with swagger
	@Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("app.core"))
				.paths(PathSelectors.ant("/api/**")).build();
	}

}
