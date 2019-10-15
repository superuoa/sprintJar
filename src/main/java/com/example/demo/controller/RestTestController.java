package com.example.demo.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTestController {
	
	@RequestMapping("/")
    public String restTest(@RequestParam(value="name", defaultValue="World") String name) {
       
        String envStr = "";
        
        Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
        	
        	envStr += envName + "=" + env.get(envName) + "<br>";
        	
        }
        
		return envStr ;
        
    }
	
}
