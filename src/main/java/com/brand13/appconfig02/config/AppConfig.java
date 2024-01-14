package com.brand13.appconfig02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.brand13.appconfig02.util.Frontend;
import com.brand13.appconfig02.util.calculator.AddCalculator;
import com.brand13.appconfig02.util.calculator.Calculator;
import com.brand13.appconfig02.util.resolver.ArgumentResolver;
import com.brand13.appconfig02.util.resolver.ScannerArgumentResolver;

@Configuration
public class AppConfig {
    
    // @Bean
    // Calculator calculator(){
    //     return new AddCalculator();
    // }

    // @Bean
    // ArgumentResolver argumentResolver(){
    //     return new ScannerArgumentResolver();
    // }

    // @Bean
    // Frontend frontend(){
    //     return new Frontend();
    // }
}
