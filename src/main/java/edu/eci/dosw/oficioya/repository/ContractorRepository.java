package edu.eci.dosw.oficioya.repository;

import edu.eci.dosw.oficioya.entity.Contractor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ContractorRepository extends JpaRepository<Contractor, Long> {
    // Consulta derivada heredada de los atributos de User[cite: 2]
    List<Contractor> findByEmailContainingIgnoreCase(String email);
}