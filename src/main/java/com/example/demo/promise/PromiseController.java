package com.example.demo.promise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PromiseController {

    @Autowired
    private PromiseRepository repository;

    @GetMapping("/promise")
    public String permits(Model model){
        model.addAttribute("promises", repository.findAll());
        return "promises";
    }

    @RequestMapping(value = "/addPromise", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("newPromiseForm", "promise",
                new Promise());
    }
}
