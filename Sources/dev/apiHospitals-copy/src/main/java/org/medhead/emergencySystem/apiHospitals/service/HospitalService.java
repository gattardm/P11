package org.medhead.emergencySystem.apiHospitals.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.medhead.emergencySystem.apiHospitals.model.Hospital;
import org.medhead.emergencySystem.apiHospitals.repository.HospitalRepository;

import lombok.Data;


@Data
@Service
public class HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;

    public Optional<Hospital> getHospital(final Long id) { return hospitalRepository.findById(id); }

    public Iterable<Hospital> getHospitals() { return hospitalRepository.findAll(); }

    public void deleteHospital(final Long id) { hospitalRepository.deleteById(id); }

    public Hospital saveHospital(Hospital hospital) {
        Hospital savedHospital = hospitalRepository.save(hospital);
        return savedHospital;
    }

}
