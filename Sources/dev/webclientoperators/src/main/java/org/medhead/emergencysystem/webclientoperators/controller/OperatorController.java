package org.medhead.emergencysystem.webclientoperators.controller;

import lombok.Data;
import org.medhead.emergencysystem.webclientoperators.model.Operator;
import org.medhead.emergencysystem.webclientoperators.service.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Data
@Controller
public class OperatorController {

    @Autowired
    private OperatorService service;

    @GetMapping("/")
    public String home(Model model) {
        Iterable<Operator> listOperator = service.getOperators();
        model.addAttribute("operators", listOperator);
        return "home";
    }

    @GetMapping("/createOperator")
    public String createOperator(Model model) {
        Operator h = new Operator();
        model.addAttribute("operator", h);
        return "formNewOperator";
    }

    @GetMapping("updateOperator/{id}")
    public String updateOperator(@PathVariable("id") final int id, Model model) {
        Operator h = service.getOperator(id);
        model.addAttribute("operator", h);
        return "formUpdateOperator";
    }

    @GetMapping("deleteOperator/{id}")
    public ModelAndView deleteOperator(@PathVariable("id") final int id) {
        service.deleteOperator(id);
        return new ModelAndView("redirect:/");
    }

    @PostMapping("/saveOperator")
    public ModelAndView saveOperator(@ModelAttribute Operator operator) {
        if(operator.getId() != null) {
            // Operator from update form has the password field not filled
            // so we fill it with the current password.
            Operator current = service.getOperator(operator.getId());
            operator.setName(current.getName());
        }
        service.saveOperator((operator));
        return new ModelAndView("redirect:/");
    }
}
