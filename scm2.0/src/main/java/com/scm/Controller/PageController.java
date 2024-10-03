package com.scm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
       public String home(Model model){
        System.out.println("Welcome home!!!!!!");
        model.addAttribute("name", "Om Prakash");
        model.addAttribute("companyName", "TexasAI");
        model.addAttribute("githubLink", "https://github.com/Opk8822/SCM");
        return "home.html";
    }
}
