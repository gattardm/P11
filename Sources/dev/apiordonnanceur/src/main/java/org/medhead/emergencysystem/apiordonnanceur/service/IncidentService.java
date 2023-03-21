package org.medhead.emergencysystem.apiordonnanceur.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.medhead.emergencysystem.apiordonnanceur.repository.IncidentProxy;
import org.medhead.emergencysystem.apiordonnanceur.model.IncidentOrd;


@Data
@Service
public class IncidentServiceOrd {

    @Autowired
    private IncidentProxy incidentProxy;

    public IncidentOrd getIncident(final int id) { return incidentProxy.getIncident(id); }

    public Iterable<IncidentOrd> getIncidents() { return incidentProxy.getIncidents(); }

    public void deleteIncident(final int id) { incidentProxy.deleteIncident(id); }

    public IncidentOrd saveIncident(IncidentOrd incident) {
        IncidentOrd savedIncident;
        savedIncident = incidentProxy.updateIncident(incident);
        return savedIncident;
    }

    public Iterable<IncidentOrd> treatedIncidents() throws InterruptedException {
        Iterable<IncidentOrd> listIncidents = incidentProxy.getIncidents();
        for ( IncidentOrd i: listIncidents) {
            Thread.sleep(5000);
            if (i.getTraitement().contains("false")) { this.treatedInProgressIncident(i); continue; }
            if (i.getTraitement().contains("En cours")) { this.treatedIncident(i); }
        }
        return incidentProxy.getIncidents();
    }

    public IncidentOrd treatedInProgressIncident(IncidentOrd incident) {
        System.out.println("avant : " + incident.toString());
        System.out.println("modification false --> En cours");
        incident.setTraitement("En cours");
        this.saveIncident(incident);

        return incident;
    }

    public IncidentOrd treatedIncident(IncidentOrd incident) {
        System.out.println("avant : " + incident.toString());
        System.out.println("modification En cours --> true");
        incident.setTraitement("true");
        System.out.println("après : " + incident.toString());
        this.saveIncident(incident);

        return incident;
    }
}
