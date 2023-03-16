package org.medhead.emergencySystem.apiHospital.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.medhead.emergencySystem.apiHospital.model.Hospital;

@Repository
public interface HospitalRepository extends CrudRepository<Hospital, Long> {
}