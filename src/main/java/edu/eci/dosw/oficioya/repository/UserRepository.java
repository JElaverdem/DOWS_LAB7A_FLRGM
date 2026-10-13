package edu.eci.dosw.oficioya.repository;

import edu.eci.dosw.oficioya.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // Consulta derivada por nombre
    List<User> findByNameContainingIgnoreCase(String name);
    
    Optional<User> findByEmail(String email);
}