package com.udea.empleados;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableAutoConfiguration
//@EnableSwagger2
//@Import({springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration.class})

public class EmpleadosApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpleadosApplication.class, args);
	}

}
