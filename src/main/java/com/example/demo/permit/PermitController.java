package com.example.demo.permit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class PermitController {

    @Autowired
    private PermitRepository repository;

    @GetMapping("/permits")
    public String permits(Model model){
        List<Permit> all = repository.findAll();
        model.addAttribute("permits", all);
        return "permits";
    }

    @RequestMapping(value = "/addPermit", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("newPermitForm", "permit",
                new Permit());
    }
}
