package edu.eci.dosw.oficioya.repository;

import edu.eci.dosw.oficioya.entity.SubscriptionPlanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.math.BigDecimal;
import java.util.List;

public interface SubscriptionPlanRepository extends JpaRepository<SubscriptionPlanEntity, String> {
    List<SubscriptionPlanEntity> findByPriceLessThan(BigDecimal price);
}
