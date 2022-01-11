package com.assuresoft.todo.controller.api.request;

import lombok.Getter;
import lombok.Setter;
import java.time.OffsetDateTime;
@Setter
@Getter
public class TaskCreateRequest {
    private String title;
    private OffsetDateTime dueDate;
    private OffsetDateTime createdDate;
    private Boolean completed;

    public TaskCreateRequest(String title, OffsetDateTime due_date, OffsetDateTime created_date, Boolean completed) {

        this.title = title;
        this.dueDate = due_date;
        this.createdDate = created_date;
        this.completed = completed;
    }
}
