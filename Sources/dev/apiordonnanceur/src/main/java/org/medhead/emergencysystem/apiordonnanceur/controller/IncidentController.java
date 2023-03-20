package org.medhead.emergencysystem.apiordonnanceur.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.medhead.emergencysystem.apiordonnanceur.service.IncidentService;
import org.medhead.emergencysystem.apiordonnanceur.model.Incident;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Data
@Controller
public class IncidentController {

    @Autowired
    private IncidentService incidentService;

    @GetMapping("/")
    public String home(Model model) {
        Iterable<Incident> listIncident = incidentService.getIncidents();
        model.addAttribute("incidents", listIncident);
        return "home";
    }

    @GetMapping("deleteIncident/{id}")
    public ModelAndView deleteIncident(@PathVariable("id") final int id) {
        incidentService.deleteIncident(id);
        return new ModelAndView("redirect:/");
    }

}
