package edu.eci.dosw.oficioya.repository;

import edu.eci.dosw.oficioya.entity.Worker;
import edu.eci.dosw.oficioya.model.AvailabilityModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
    // Consulta derivada por oficio principal[cite: 2]
    List<Worker> findByOficioPrincipalContainingIgnoreCase(String oficioPrincipal);
    
    // Consulta derivada por estado de disponibilidad
    List<Worker> findByDisponibilidad(AvailabilityModel disponibilidad);
}