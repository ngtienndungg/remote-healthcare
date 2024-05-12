package com.dungnt.remote_healthcare.repository;

import com.dungnt.remote_healthcare.entity.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends MongoRepository<Appointment, String> {

    Appointment findBy_id(String _id);
}
