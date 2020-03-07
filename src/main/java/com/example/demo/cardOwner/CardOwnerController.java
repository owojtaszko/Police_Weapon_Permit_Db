package com.example.demo.cardOwner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.owner.Owner;

@Controller
@RequestMapping
public class CardOwnerController {

    @Autowired
    private CardOwnerRepository repository;

    @GetMapping("/")
    public String index(){
        return "hello";
    }

    @GetMapping("/cardsOwner")
    public String own(Model model){
        model.addAttribute("cardOwner", repository.findAll());
        return "cardsOwner";
    }

    @RequestMapping(value = "/addCardOwner", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("newCardOwnerForm", "cardOwner",
                new CardOwner());
    }
}
