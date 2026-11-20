package org.demo.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration //this class contains setup and instruction and definition for the application should run
@ComponentScan("org.demo.controller")  //you are telling the spring Scan inside this package find my controllers automatically and register them so they handle web requests
@EnableWebMvc //is building the kitchen ,installing the stove,buying the the plates and setting up the cash register
public class MywebConfig {
	

}
