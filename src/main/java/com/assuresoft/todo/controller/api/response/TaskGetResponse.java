package com.assuresoft.todo.controller.api.response;

import java.time.OffsetDateTime;

public class TaskGetResponse {
    private Long taskId;
    private String title;
    private OffsetDateTime dueDate;
    private OffsetDateTime createdDate;
    private Boolean completed;

    public TaskGetResponse(Long taskId, String title, OffsetDateTime dueDate, OffsetDateTime createdDate, Boolean completed) {
        this.taskId = taskId;
        this.title = title;
        this.dueDate = dueDate;
        this.createdDate = createdDate;
        this.completed = completed;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public OffsetDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(OffsetDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
