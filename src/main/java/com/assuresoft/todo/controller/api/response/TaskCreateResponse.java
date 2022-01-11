package com.assuresoft.todo.controller.api.response;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskCreateResponse {
    private String taskTitle;
    private  Long taskId;

    public TaskCreateResponse(String task, Long taskId) {
        this.taskTitle = task;
        this.taskId = taskId;
    }
}
