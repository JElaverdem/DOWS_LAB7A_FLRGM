package edu.eci.dosw.oficioya.repository;

import edu.eci.dosw.oficioya.entity.UserSubscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSubscriptionRepository extends JpaRepository<UserSubscription, Long>{
    
}