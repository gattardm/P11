package org.medhead.emergencysystem.apiHospital.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import org.medhead.emergencysystem.apiHospital.model.Hospital;
@Repository
public interface HospitalRepository extends CrudRepository<Hospital, Long> {
}
