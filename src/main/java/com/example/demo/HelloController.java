package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping(value="/", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getMessage() {
        return "Hello World Spring-Boot --- v5 ---- online! ";
    }

    @GetMapping(value="/env", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getEnv() {
	    String var = System.getenv("env_var");
	    String db_var = System.getenv("db_connection");
        return "System property:" + var +" and connectionDB:" + db_var;
    }

}
