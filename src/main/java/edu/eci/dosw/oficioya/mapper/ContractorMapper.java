package edu.eci.dosw.oficioya.mapper;

import edu.eci.dosw.oficioya.model.ContractorModel;
import edu.eci.dosw.oficioya.entity.Contractor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContractorMapper {
    Contractor toEntity(ContractorModel contractorModel);
    ContractorModel toModel(Contractor contractor);
}
