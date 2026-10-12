package edu.eci.dosw.oficioya.mapper;

import edu.eci.dosw.oficioya.model.SubscriptionPlanModel;
import edu.eci.dosw.oficioya.entity.SubscriptionPlan;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubscriptionPlanMapper {
    SubscriptionPlan toEntity(SubscriptionPlanModel subscriptionPlanModel);
    SubscriptionPlanModel toModel (SubscriptionPlan subscriptionPlan);
}
