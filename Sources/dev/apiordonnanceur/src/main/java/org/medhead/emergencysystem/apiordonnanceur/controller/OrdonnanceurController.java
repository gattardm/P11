package org.medhead.emergencysystem.apiordonnanceur.controller;

import lombok.Data;
import org.medhead.emergencysystem.apiordonnanceur.model.Operator;
import org.medhead.emergencysystem.apiordonnanceur.service.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.medhead.emergencysystem.apiordonnanceur.service.IncidentService;
import org.medhead.emergencysystem.apiordonnanceur.model.Incident;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Data
@Controller
public class OrdonnanceurController {

    @Autowired
    private IncidentService incidentService;

    @Autowired
    private OperatorService operatorService;


    @GetMapping("/")
    public String home(Model model) throws InterruptedException {
       Iterable<Incident> listIncidents = incidentService.treatedIncidents();
       Iterable<Operator> listOperators = operatorService.treatedOperators();
//        Iterable<Operator> listOperators = operatorService.getOperators();

        model.addAttribute("incidents", listIncidents);
        model.addAttribute("operators", listOperators);
        return "home";
    }

}
