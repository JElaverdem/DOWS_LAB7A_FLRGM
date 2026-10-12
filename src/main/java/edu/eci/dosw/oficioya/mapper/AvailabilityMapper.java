package edu.eci.dosw.oficioya.mapper;

import edu.eci.dosw.oficioya.model.AvailabilityModel;
import edu.eci.dosw.oficioya.entity.Availability;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AvailabilityMapper {
    Availability toEntity(AvailabilityModel availabilityModel);
    AvailabilityModel toModel(Availability availability);
}
