package com.brand13.appconfig02.util.resolver;

import java.io.InputStream;

public interface ArgumentResolver {
    Argument resolve(InputStream stream);    
}
