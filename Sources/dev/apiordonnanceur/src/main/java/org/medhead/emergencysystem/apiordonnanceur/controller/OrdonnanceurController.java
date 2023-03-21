package org.medhead.emergencysystem.apiordonnanceur.controller;

import lombok.Data;
import org.medhead.emergencysystem.apiordonnanceur.model.OperatorOrd;
import org.medhead.emergencysystem.apiordonnanceur.service.OperatorServiceOrd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.medhead.emergencysystem.apiordonnanceur.service.IncidentServiceOrd;
import org.medhead.emergencysystem.apiordonnanceur.model.IncidentOrd;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Data
@Controller
public class IncidentControllerOrd {

    @Autowired
    private IncidentServiceOrd incidentServiceOrd;
    private OperatorServiceOrd operatorServiceOrd;


    @GetMapping("/")
    public String home(Model model) throws InterruptedException {
        Iterable<IncidentOrd> listIncidents = incidentServiceOrd.treatedIncidents();
        Iterable<OperatorOrd> listOperators = operatorServiceOrd.getOperators();
        model.addAttribute("incidents", listIncidents);
        model.addAttribute("operators", listOperators);
        return "home";
    }

}
