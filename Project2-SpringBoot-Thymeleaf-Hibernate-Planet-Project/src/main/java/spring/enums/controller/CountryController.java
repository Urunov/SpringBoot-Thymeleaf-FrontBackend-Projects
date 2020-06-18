package spring.enums.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import spring.enums.model.Birthplace;

/**
 * @Created 18 / 06 / 2020 - 4:51 PM
 * @project SpringBootEnum
 * @Author Hamdamboy
 */
@Controller
public class CountryController {

    @PostMapping("/selectedCountry")
    public String selected(Birthplace birthplace, Model model) {
        model.addAttribute("birthplace", birthplace);
        return "selectedCountry";
    }

    @GetMapping("/countries")
    public String countries(Model model) {
        model.addAttribute("birthplace", new Birthplace());
        return "countries";
    }

}
