package net.suraj;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/hello")
    public String sayHello(Model model){
        System.out.println("Saying Hello World Spring Boot....");
        model.addAttribute("Message", "Greetings from Suraj");
        return "hello";
    }
}
