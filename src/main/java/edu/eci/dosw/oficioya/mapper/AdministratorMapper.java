package edu.eci.dosw.oficioya.mapper;

import edu.eci.dosw.oficioya.model.AdministratorModel;
import edu.eci.dosw.oficioya.entity.Administrator;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AdministratorMapper {
    Administrator toEntity(AdministratorModel AdministratorModel);
    AdministratorModel toModel(Administrator Administrator);
}