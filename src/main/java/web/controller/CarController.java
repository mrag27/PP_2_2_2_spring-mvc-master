package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;


@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String CarCount(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        model.addAttribute("carCount", CarServiceImpl.getCountCar(count));
        return "cars";
    }
}
