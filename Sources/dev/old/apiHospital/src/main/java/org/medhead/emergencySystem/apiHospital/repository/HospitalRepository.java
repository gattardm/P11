package org.medhead.emergencySystem.apiHospital.repository;

import org.medhead.emergencySystem.apiHospital.model.Hospital;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends CrudRepository<Hospital, Long> {
}
