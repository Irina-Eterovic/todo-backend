package com.assuresoft.todo.service;

import com.assuresoft.todo.controller.api.request.TaskCreateRequest;
import com.assuresoft.todo.controller.api.request.TaskUpdateRequest;
import com.assuresoft.todo.controller.api.response.TaskCreateResponse;
import com.assuresoft.todo.controller.api.response.TaskGetListResponse;
import com.assuresoft.todo.controller.api.response.TaskGetResponse;
import com.assuresoft.todo.controller.api.response.TaskUpdateResponse;
import com.assuresoft.todo.persistence.Task;
import com.assuresoft.todo.persistence.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;
    public TaskGetListResponse listAllTask(){
        List<Task> taskList= taskRepository.findAll();
        return new TaskGetListResponse(taskList);
    }

    public TaskCreateResponse createTask(TaskCreateRequest taskRequest){
        Task task = new Task();
        task.setCompleted(taskRequest.getCompleted());
        task.setTitle(taskRequest.getTitle());
        task.setDueDate(taskRequest.getDueDate());
        task.setCreatedDate(taskRequest.getCreatedDate());
        task = taskRepository.save(task);
        return new TaskCreateResponse(taskRequest.getTitle(),task.getTaskId());
    }

    public TaskGetResponse findTaskById(Long taskId) {
        Task task = taskRepository.getById(taskId);
        return new TaskGetResponse(task.getTaskId(),task.getTitle(),task.getDueDate(),task.getCreatedDate(),task.getCompleted());
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

    public Task updateTask(Long taskId, Task completedTask) {
        Task updatedTask = taskRepository.getById(taskId);
        updatedTask.setCompleted(completedTask.getCompleted());
        updatedTask.setTitle(completedTask.getTitle());
        updatedTask.setDueDate(completedTask.getDueDate());
        return taskRepository.save(updatedTask);
    }
}
