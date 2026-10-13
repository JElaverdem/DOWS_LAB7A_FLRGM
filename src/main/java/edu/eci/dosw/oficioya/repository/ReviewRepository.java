package edu.eci.dosw.oficioya.repository;

import edu.eci.dosw.oficioya.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    // Consulta derivada para buscar reseñas por encima de un rating específico[cite: 2]
    List<Review> findByRatingGivenGreaterThanEqual(Double rating);
}