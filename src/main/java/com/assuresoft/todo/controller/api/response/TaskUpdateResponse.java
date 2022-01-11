package com.assuresoft.todo.controller.api.response;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskUpdateResponse {
    private Long taskId;
    private Boolean completed;

    public TaskUpdateResponse(Long taskId, Boolean completed) {
        this.taskId = taskId;
        this.completed = completed;
    }
}
