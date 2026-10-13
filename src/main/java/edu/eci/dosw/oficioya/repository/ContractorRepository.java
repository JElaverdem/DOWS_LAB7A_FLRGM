package edu.eci.dosw.oficioya.repository;

import edu.eci.dosw.oficioya.entity.Contractor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ContractorRepository extends JpaRepository<Contractor, Long> {

}