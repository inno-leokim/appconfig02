package com.brand13.appconfig02.util.resolver;

import java.io.InputStream;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class ScannerArgumentResolver implements ArgumentResolver{

    @Override
    public Argument resolve(InputStream stream) {
        
        Scanner scanner = new Scanner(stream);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        scanner.close();

        return new Argument(a, b);
        
    }
    
}
