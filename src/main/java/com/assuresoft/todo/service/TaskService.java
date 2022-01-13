package com.assuresoft.todo.service;

import com.assuresoft.todo.controller.api.request.TaskCreateRequest;
import com.assuresoft.todo.controller.api.request.TaskUpdateRequest;
import com.assuresoft.todo.controller.api.response.TaskUpdateResponse;
import com.assuresoft.todo.dto.TaskDTO;
import com.assuresoft.todo.mapper.TaskMapper;
import com.assuresoft.todo.persistence.Task;
import com.assuresoft.todo.persistence.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private TaskMapper mapper;


    public List<TaskDTO> listAllTask(){
        List<Task> taskList= taskRepository.findAll();
        return mapper.taskListTaskDTOList(taskList);
    }
    public TaskDTO findTaskById(Long taskId) {
        Task task = taskRepository.getById(taskId);
        return  mapper.taskToTaskDTO(task);
    }
    public TaskDTO createTask(Task task){
        task = taskRepository.save(task);
        return mapper.taskToTaskDTO(task);
    }
    public Task updateTask(Long taskId, Task completedTask) {
        Task updatedTask = taskRepository.getById(taskId);
        updatedTask.setCompleted(completedTask.getCompleted());
        updatedTask.setTitle(completedTask.getTitle());
        updatedTask.setDueDate(completedTask.getDueDate());
        return taskRepository.save(updatedTask);
    }

    public void deleteTask(Long taskId) {
         taskRepository.deleteById(taskId);
    }

    public TaskUpdateResponse updateComplete(Long taskId, TaskUpdateRequest completedTask) {
        Task updatedTask = taskRepository.getById(taskId);
        updatedTask.setCompleted(completedTask.getCompleted());
        taskRepository.save(updatedTask);
        return new TaskUpdateResponse(taskId,completedTask.getCompleted());
    }

    public Task updateTitle(Long taskId, TaskUpdateRequest completedTask) {
        Task updatedTask = taskRepository.getById(taskId);
        updatedTask.setTitle(completedTask.getTitle());
        return taskRepository.save(updatedTask);
    }


}
