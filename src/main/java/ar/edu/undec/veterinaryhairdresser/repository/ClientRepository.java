package ar.edu.undec.veterinaryhairdresser.repository;

import ar.edu.undec.veterinaryhairdresser.model.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientEntity, Integer> {
}
