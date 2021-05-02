package com.example.todolist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringBootHelloWorld {
    @GetMapping("/index")
    public String helloIndex(){
        return "index";
    }
    @GetMapping("/main")
    public String helloMain(){
        return "main";
    }
    @RequestMapping("/helloworld")
    public String helloWorld(Model model)throws Exception{
        model.addAttribute("mav","我是MVC");
        return "helloworld";
    }
}
