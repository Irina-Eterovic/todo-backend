package com.assuresoft.todo.controller;

import com.assuresoft.todo.controller.api.request.TaskCreateRequest;
import com.assuresoft.todo.controller.api.request.TaskUpdateRequest;
import com.assuresoft.todo.controller.api.response.TaskUpdateResponse;
import com.assuresoft.todo.dto.TaskDTO;
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
    public List<TaskDTO> allTasks() {
        return taskService.listAllTask();
    }
    @PostMapping("/task/create")
    public TaskDTO newTask(@RequestBody Task newTask) {
        return taskService.createTask(newTask);
    }
    @GetMapping("/task/{taskId}")
    public TaskDTO getTask(@PathVariable("taskId") Long taskId) {
        return taskService.findTaskById(taskId);
    }
    @DeleteMapping("/task/{taskId}")
     public ResponseEntity<Long> deleteTask(@PathVariable("taskId") Long taskId) {
        taskService.deleteTask(taskId);
        return  new ResponseEntity<>(taskId, HttpStatus.OK);
    }
    @PatchMapping("task/{taskId}/complete")
    public TaskUpdateResponse updateTaskComplete(@PathVariable("taskId") Long taskId, @RequestBody TaskUpdateRequest completedTask){
        return taskService.updateComplete(taskId, completedTask);
    }
   @PatchMapping("task/{taskId}/title")
    public Task updateTitle(@PathVariable("taskId") Long taskId,  @RequestBody TaskUpdateRequest completedTask){
        return taskService.updateTitle(taskId, completedTask);
    }
    @PatchMapping("task/{taskId}/")
    public Task updateTask(@PathVariable("taskId") Long taskId,  @RequestBody Task completedTask){
        return taskService.updateTask(taskId, completedTask);
    }
}
