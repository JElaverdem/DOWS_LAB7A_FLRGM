package edu.eci.dosw.oficioya.repository;

import edu.eci.dosw.oficioya.entity.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministratorRepository extends JpaRepository<Administrator, Long>{
    
}
