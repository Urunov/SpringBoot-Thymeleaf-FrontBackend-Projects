package spring.enums.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import spring.enums.model.Home;

/**
 * @Created 18 / 06 / 2020 - 5:02 PM
 * @project SpringBootEnum
 * @Author Hamdamboy
 */
@Controller
public class SolarSystemController {

    @PostMapping("/selectedPlanet")
    public String saveHome(Home home, Model model) {
        model.addAttribute("home", home);
        return "selectedPlanet";
    }

    @GetMapping("/")
    public String solarSystem(Model model) {
        model.addAttribute("home", new Home());
        return "solarSystem";
    }
}
