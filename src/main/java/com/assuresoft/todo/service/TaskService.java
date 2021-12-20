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
//    public abstract void updateTask(Long id, Task task);
//    public abstract void deleteTask(Long id);
    public  List<Task> getAllTasks(){
        return taskRepository.findAll();
    }
    public  Task createTask(Task task){
        return taskRepository.save(task);
    };
}
