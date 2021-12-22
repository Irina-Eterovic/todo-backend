package com.assuresoft.todo.controller.api.response;

public class TaskUpdateResponse {
    private Long taskId;
    private Boolean completed;

    public TaskUpdateResponse(Long taskId, Boolean completed) {
        this.taskId = taskId;
        this.completed = completed;
    }
    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
