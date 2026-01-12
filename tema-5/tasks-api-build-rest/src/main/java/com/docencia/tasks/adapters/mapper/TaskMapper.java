package com.docencia.tasks.adapters.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.docencia.tasks.adapters.in.api.TaskRequest;
import com.docencia.tasks.adapters.in.api.TaskResponse;
import com.docencia.tasks.domain.model.Task;
import com.docencia.tasks.entitys.TaskEntity;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    @Mapping(source="id", target="identificador")
    @Mapping(source = "title", target ="titulo")
    @Mapping(source = "description", target = "descripcion")
    @Mapping(source = "completed", target = "completado")
    public Task toTask(TaskRequest source);

    public List<Task> toTasks(List<TaskRequest> requests);

    @Mapping(source="id", target="identificador")
    @Mapping(source = "title", target ="titulo")
    @Mapping(source = "description", target = "descripcion")
    @Mapping(source = "completed", target = "completado")
    public Task entityToTask(TaskEntity source);

    public List<Task> entityesToTasks(List<TaskEntity> entities);

    @Mapping(source="identificador", target="id")
    @Mapping(source = "titulo", target ="title")
    @Mapping(source = "descripcion", target = "description")
    @Mapping(source = "completado", target = "completed")
    public TaskResponse taskToResponse(Task source);
}
