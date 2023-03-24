package com.restful_web_services.restful_web_services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello_world {
   @GetMapping(path = "/Helloworld")
   public String helloworld() {
	   return "helloworld";
   }
}
