package com.thinkitive.RestApiExtra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/showdata")
     public String showData(){
         return "Hello! Welcome to java";
     }

     @GetMapping("/show/{name}")
     public String pathVariable(@PathVariable String name){
        return name;
     }
}
