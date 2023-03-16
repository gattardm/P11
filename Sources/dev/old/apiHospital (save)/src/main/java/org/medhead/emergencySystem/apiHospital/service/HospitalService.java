package org.medhead.emergencySystem.apiHospital.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.medhead.emergencySystem.apiHospital.repository.HospitalRepository;
import org.medhead.emergencySystem.apiHospital.model.Hospital;
import java.util.Optional;

@Data
@Service
public class HospitalService {
    @Autowired
    private HospitalRepository hospitalRepository;

    public Optional<Hospital> getHospital(final Long id) {
        return hospitalRepository.findById(id);
    }

    public Iterable<Hospital> getHospitals() {
        return hospitalRepository.findAll();
    }

    public void deleteHospital(final Long id) {
        hospitalRepository.deleteById(id);
    }

    public Hospital saveHospital(Hospital hospital) {
        Hospital savedHospital = hospitalRepository.save(hospital);
        return savedHospital;
    }
}
