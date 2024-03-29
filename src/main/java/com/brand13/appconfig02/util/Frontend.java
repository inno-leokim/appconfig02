package com.brand13.appconfig02.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.brand13.appconfig02.util.calculator.Calculator;
import com.brand13.appconfig02.util.resolver.Argument;
import com.brand13.appconfig02.util.resolver.ArgumentResolver;

@Component
public class Frontend {
    
    @Autowired ArgumentResolver argumentResolver;
    
    @Autowired Calculator calculator;

    public void run(){
        System.out.println("Enter 2 number like 'a b' : ");
        Argument argument = argumentResolver.resolve(System.in);
        int result = calculator.calc(argument.getA(), argument.getB());
        System.out.println("result = " + result);
    }
}
