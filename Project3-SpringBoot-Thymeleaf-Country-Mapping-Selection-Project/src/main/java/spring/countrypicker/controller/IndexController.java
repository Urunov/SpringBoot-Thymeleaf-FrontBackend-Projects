package spring.countrypicker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.countrypicker.main.Address;

/**
 * @Created 19 / 06 / 2020 - 11:10 AM
 * @project SpringBootCountrypicker
 * @Author Hamdamboy
 */

@Controller
@RequestMapping({"/", "/index"})
public class IndexController {

    @GetMapping
    public String main(Model model){
            model.addAttribute("address", new Address());
            return "index";
    }

    @PostMapping
    public String save(Address address, Model model){
        model.addAttribute("address", address);

        return "saved";
    }
}
