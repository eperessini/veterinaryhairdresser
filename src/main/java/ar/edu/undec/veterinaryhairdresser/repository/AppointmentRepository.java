package ar.edu.undec.veterinaryhairdresser.repository;

import ar.edu.undec.veterinaryhairdresser.model.AppointmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository <AppointmentEntity, Integer> {
}
