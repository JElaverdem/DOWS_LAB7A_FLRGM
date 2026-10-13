package edu.eci.dosw.oficioya.mapper;

import edu.eci.dosw.oficioya.model.UserModel;
import edu.eci.dosw.oficioya.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {UserSubscriptionMapper.class,WorkerMapper.class})
public interface UserMapper {

    UserModel toModel(User entity);

    User toEntity(UserModel model);
}