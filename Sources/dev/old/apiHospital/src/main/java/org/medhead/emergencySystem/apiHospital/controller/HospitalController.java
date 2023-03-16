package org.medhead.emergencySystem.apiHospital.controller;

import org.medhead.emergencySystem.apiHospital.model.Hospital;
import org.medhead.emergencySystem.apiHospital.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    /**
     * Create - Add a new hospital
     * @param hospital An object hospital
     * @return The hospital object saved
     */
    @PostMapping("/hospital")
    public Hospital createHospital(@RequestBody Hospital hospital) {
        return hospitalService.saveHospital(hospital);
    }

    /**
     * Read - Get one hospital
     * @param id The id of the hospital
     * @return An Hospital object full filled
     */
    @GetMapping("/hospital/{id}")
    public Hospital getHospital(@PathVariable("id") final Long id) {
        Optional<Hospital> hospital = hospitalService.getHospital(id);
        if(hospital.isPresent()) {
            return hospital.get();
        } else {
            return null;
        }
    }

    /**
     * Read - Get all hospitals
     * @return - An Iterable object of Hospital full filled
     */
    @GetMapping("/hospitals")
    public Iterable<Hospital> getHospitals() {
        return hospitalService.getHospitals();
    }

    /**
     * Update - Update an existing hospital
     * @param id - The id of the hospital to update
     * @param hospital - The hospital object updated
     * @return
     */

    @PutMapping("/hospital/{id}")
    public Hospital updateHospital(@PathVariable("id") final Long id, @RequestBody Hospital hospital) {
        Optional<Hospital> h = hospitalService.getHospital(id);
        if(h.isPresent()) {
            Hospital currentHospital = h.get();
            String name = hospital.getName();
            if(name!=null) currentHospital.setName((name));

            String longitude = hospital.getLongitude();
            if(longitude!=null) currentHospital.setLongitude(hospital.getLongitude());

            String latitude = hospital.getLatitude();
            if (latitude!=null) currentHospital.setLatitude(hospital.getLatitude());

            String bedsQuantity = hospital.getBedsQuantity();
            if (bedsQuantity!=null) currentHospital.setBedsQuantity(hospital.getBedsQuantity());

            String bedsAvailable = hospital.getBedsAvailable();
            if (bedsAvailable!=null) currentHospital.setBedsAvailable(hospital.getBedsAvailable());

            String speciality = hospital.getSpeciality();
            if (speciality!=null) currentHospital.setSpeciality(speciality);

            return currentHospital;

        } else {
            return null;
        }
    }

    @DeleteMapping("/hospital/{id}")
    public void deleteHospital(@PathVariable("id") final Long id) {
        hospitalService.deleteHospital(id);
    }
}
