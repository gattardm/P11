package org.medhead.emergencySystem.apiHospitals.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import org.medhead.emergencySystem.apiHospitals.model.Hospital;
@Repository
public interface HospitalRepository extends CrudRepository<Hospital, Long> {
}
