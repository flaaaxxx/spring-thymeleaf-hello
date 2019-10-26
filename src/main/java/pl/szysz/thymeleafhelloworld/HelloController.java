package pl.szysz.thymeleafhelloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String get(Model model){
        Car car1 = new Car("BMW", "i8");
        Car car2 = new Car("Audi", "A6");
        Car car3 = new Car("Polonez", "Caro");
        Car car4 = new Car("Fiat", "126P");
        List<Car> cars= Arrays.asList(car1, car2, car3, car4);

//        model jest dostepny w szablonie hello
        model.addAttribute("name", "lukasz");
        model.addAttribute("cars", cars);
        return "hello";
    }
}
