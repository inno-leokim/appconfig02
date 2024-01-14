package com.brand13.appconfig02;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.boot.CommandLineRunner;

import com.brand13.appconfig02.config.AppConfig;
import com.brand13.appconfig02.util.Frontend;
import com.brand13.appconfig02.util.calculator.Calculator;
import com.brand13.appconfig02.util.resolver.Argument;
import com.brand13.appconfig02.util.resolver.ArgumentResolver;

@EnableAutoConfiguration
// @Import(AppConfig.class)
@SpringBootApplication
public class Appconfig02Application implements CommandLineRunner {

	@Autowired 
	ArgumentResolver argumentResolver;

	@Autowired
	Calculator calculator;


	public static void main(String[] args){

		// try(ConfigurableApplicationContext context = SpringApplication.run(Appconfig02Application.class, args)){

			// # 1
			// Scanner scanner = new Scanner(System.in);
			// System.out.println("Enter 2 number like 'a b' : ");
			// int a = scanner.nextInt();
			// int b = scanner.nextInt();

			// Calculator calculator = context.getBean(Calculator.class);
			// int result = calculator.calc(a, b);
			// System.out.println("result = " + result);

			// # 2
			// Frontend frontend = context.getBean(Frontend.class);
			// frontend.run();
		// }

		SpringApplication.run(Appconfig02Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("Enter 2 numbers like 'a b' : ");
		Argument argument = argumentResolver.resolve(System.in);
		int result = calculator.calc(argument.getA(), argument.getB());
		System.out.println("result = " + result);
	}

}
