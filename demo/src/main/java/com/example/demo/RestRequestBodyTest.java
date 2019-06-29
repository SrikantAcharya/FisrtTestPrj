package com.example.demo;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class RestRequestBodyTest {
	
	@Autowired
    private ServletContext servletContext;

	@GetMapping("/{name}")
	
    public void getName(@PathVariable String name) {
        System.out.println("request body : " + name + servletContext.getContextPath());
        
    }
}