package pl.szysz.thymeleafhelloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String get(Model model){
        Car car = new Car("BMW", "A5");
//        model dostepny jest w szablonie hello
        model.addAttribute("name", "lukasz");
        model.addAttribute("car", car);
        return "hello";
    }
}
