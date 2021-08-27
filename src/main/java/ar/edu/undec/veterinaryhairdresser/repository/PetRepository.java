package ar.edu.undec.veterinaryhairdresser.repository;

import ar.edu.undec.veterinaryhairdresser.model.PetEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<PetEntity, Integer> {
}
