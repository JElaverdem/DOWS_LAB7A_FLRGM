package edu.eci.dosw.oficioya.mapper;

import edu.eci.dosw.oficioya.model.RequestModel;
import edu.eci.dosw.oficioya.entity.Request;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RequestMapper {

    RequestModel toModel(Request entity);

    Request toEntity(RequestModel model);
}