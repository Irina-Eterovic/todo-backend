package com.assuresoft.todo.controller.api.response;

import java.time.OffsetDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
}
