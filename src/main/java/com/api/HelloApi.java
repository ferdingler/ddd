package com.api;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello") 
public class HelloApi {

    @Get(produces = MediaType.TEXT_PLAIN) 
    public String index() {
        return "Hello World"; 
    }
}