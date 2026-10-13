package edu.eci.dosw.oficioya.mapper;

import edu.eci.dosw.oficioya.model.WorkerModel;
import edu.eci.dosw.oficioya.entity.Worker;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = AvailabilityMapper.class)
public interface WorkerMapper {
    WorkerModel toModel(Worker worker);
    Worker toEntity(WorkerModel workerModel);
}
