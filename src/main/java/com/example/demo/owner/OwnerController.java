package com.example.demo.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OwnerController {

    @Autowired
    private OwnerRepository repository;

//    @GetMapping("/")
    public String index() {
        return "owners";
    }

    @GetMapping("/owners")
    public String own(Model model) {
        model.addAttribute("owners", repository.findAll());
        return "owners";
    }

    @RequestMapping(value = "/addOwner", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("newOwnerForm", "owner",
                new Owner());
    }

}
