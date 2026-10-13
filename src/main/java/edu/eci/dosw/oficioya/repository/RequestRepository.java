package edu.eci.dosw.oficioya.repository;

import edu.eci.dosw.oficioya.entity.Request;
import edu.eci.dosw.oficioya.entity.RequestState;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RequestRepository extends JpaRepository<Request, Long> {
    // Consulta derivada por ubicación[cite: 2]
    List<Request> findByLocationContainingIgnoreCase(String location);
    
    List<Request> findByStateName(RequestState state);
}