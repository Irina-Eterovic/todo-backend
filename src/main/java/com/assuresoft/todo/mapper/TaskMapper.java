package com.assuresoft.todo.mapper;
import com.assuresoft.todo.dto.TaskDTO;
import com.assuresoft.todo.persistence.Task;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    TaskDTO taskToTaskDTO(Task task);
    Task taskDTOtoTask(TaskDTO taskDTO);

    List<TaskDTO> taskListTaskDTOList(List<Task> taskList);
}
