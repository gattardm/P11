package org.medhead.emergencysystem.apiordonnanceur.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.medhead.emergencysystem.apiordonnanceur.repository.IncidentProxy;
import org.medhead.emergencysystem.apiordonnanceur.model.Incident;

import java.util.Optional;


@Data
@Service
public class IncidentService {

    @Autowired
    private IncidentProxy incidentProxy;

    public Incident getIncident(final int id) { return incidentProxy.getIncident(id); }

    public Iterable<Incident> getIncidents() { return incidentProxy.getIncidents(); }

    public void deleteIncident(final int id) { incidentProxy.deleteIncident(id); }
}
