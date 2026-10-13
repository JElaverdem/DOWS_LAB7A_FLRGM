package edu.eci.dosw.oficioya.mapper;

import edu.eci.dosw.oficioya.model.RequestStateModel;
import edu.eci.dosw.oficioya.entity.RequestState;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RequestStateMapper {
    RequestState toEntity(RequestStateModel requestStateModel);
    RequestStateModel toModel(RequestState requestState);
}
