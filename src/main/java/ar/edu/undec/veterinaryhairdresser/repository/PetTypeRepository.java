package ar.edu.undec.veterinaryhairdresser.repository;

import ar.edu.undec.veterinaryhairdresser.model.PetTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetTypeRepository extends JpaRepository <PetTypeEntity, Integer>  {
}
