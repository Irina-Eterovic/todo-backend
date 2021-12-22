package com.assuresoft.todo.controller.api.request;

import java.time.OffsetDateTime;
import java.time.OffsetTime;

public class TaskCreateRequest {
    private String title;
    private OffsetDateTime dueDate;
    private OffsetDateTime createdDate;
    private Boolean completed;

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

    public TaskCreateRequest(String title, OffsetDateTime due_date, OffsetDateTime created_date, Boolean completed) {

        this.title = title;
        this.dueDate = due_date;
        this.createdDate = created_date;
        this.completed = completed;
    }
}
