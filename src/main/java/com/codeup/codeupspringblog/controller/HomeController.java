package com.codeup.codeupspringblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String welcome(){
        return "home";
    }


    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name", "world")
                return "hello";
    }

    @GetMapping("/hello/{name}")
    public String sayHello(Model model, @PathVariable String name){
        model.addAttribute("username")
    }

    @GetMapping("/grettings")
    public String greetingSubmit(@RequestParam("name") String name, Model model) {
        model.addAttribute("helloBanner", "Hello, " + name + "!");
        return "greetings";
    }


}
