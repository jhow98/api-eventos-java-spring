package api.eventos.api.repositories;

import api.eventos.api.domain.adress.Adress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AdressRepository extends JpaRepository<Adress, UUID> {
}
