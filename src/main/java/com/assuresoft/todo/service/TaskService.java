package com.assuresoft.todo.service;

import com.assuresoft.todo.persistence.Task;
import com.assuresoft.todo.persistence.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;
    public  List<Task> listAllTask(){
        return taskRepository.findAll();
    }
    public  Task createTask(Task task){
        return taskRepository.save(task);
    }

    public Task findTaskById(Long taskId) {
        return taskRepository.getById(taskId);
    }

    public void deleteTask(Long taskId) {
         taskRepository.deleteById(taskId);
    }

    public Task updateComplete(Long taskId, Task completedTask) {
        Task updatedTask = taskRepository.getById(taskId);
        updatedTask.setCompleted(completedTask.getCompleted());
        return taskRepository.save(updatedTask);
    }

    public Task updateTitle(Long taskId, Task completedTask) {
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
