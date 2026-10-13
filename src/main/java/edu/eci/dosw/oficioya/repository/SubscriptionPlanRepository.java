package edu.eci.dosw.oficioya.repository;

import edu.eci.dosw.oficioya.entity.SubscriptionPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import java.math.BigDecimal;
import java.util.List;

public interface SubscriptionPlanRepository extends JpaRepository<SubscriptionPlan, String> {
    List<SubscriptionPlan> findByPriceLessThan(BigDecimal price);
}
