package com.example.demo.gun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GunController {

    @Autowired
    private GunRepository repository;

//    @GetMapping("/")
    public String index(){
        return "owners";
    }

    @GetMapping("/guns")
    public String own(Model model){
        model.addAttribute("guns", repository.findAll());
        return "guns";
    }

    @RequestMapping(value = "/addGun", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("newGunForm", "gun",
                new Gun());
    }

}
