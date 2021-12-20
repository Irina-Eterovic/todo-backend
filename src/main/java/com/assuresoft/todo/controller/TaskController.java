package com.assuresoft.todo.controller;

import com.assuresoft.todo.persistence.Task;
import com.assuresoft.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/task/list")
    public ResponseEntity<List<Task>> allTasks() {
        return new ResponseEntity<>(taskService.listAllTask(), HttpStatus.OK);
    }
    @PostMapping("/task/create")
    public Task newTask(@RequestBody Task newTask) {
        return taskService.createTask(newTask);
    }
    @GetMapping("/task/{taskId}")
    public Task getTask(@PathVariable("taskId") Long taskId) {
        return taskService.findTaskById(taskId);
    }
    @DeleteMapping("/task/{taskId}")
     public void deleteTask(@PathVariable("taskId") Long taskId) {
        taskService.deleteTask(taskId);
    }
    @PatchMapping("task/{taskId}/complete")
    public Task updateTask(@PathVariable("taskId") Long taskId,  @RequestBody Task completedTask){
        return taskService.updateComplete(taskId, completedTask);
    }
   @PatchMapping("task/{taskId}/title")
    public Task updateTitle(@PathVariable("taskId") Long taskId,  @RequestBody Task completedTask){
        return taskService.updateTitle(taskId, completedTask);
    }
    @PatchMapping("task/{taskId}/")
    public Task updateTaske(@PathVariable("taskId") Long taskId,  @RequestBody Task completedTask){
        return taskService.updateTask(taskId, completedTask);
    }
}
