package ar.edu.undec.veterinaryhairdresser.repository;

import ar.edu.undec.veterinaryhairdresser.model.CutTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CutTypeRepository extends JpaRepository<CutTypeEntity, Integer> {
}
