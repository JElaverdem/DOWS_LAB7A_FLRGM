package edu.eci.dosw.oficioya.mapper;

import edu.eci.dosw.oficioya.model.UserSubscriptionModel;
import edu.eci.dosw.oficioya.entity.UserSubscription;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserSubscriptionMapper {
    UserSubscriptionModel toModel(UserSubscription userSubscription);
    UserSubscription toEntity(UserSubscriptionModel userSubscriptionModel);
}
