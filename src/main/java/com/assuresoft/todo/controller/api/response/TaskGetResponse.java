package com.assuresoft.todo.controller.api.response;

import java.time.OffsetDateTime;

import lombok.*;

public class TaskGetResponse {
    private Long taskId;
    private String title;
    private OffsetDateTime dueDate;
    private OffsetDateTime createdDate;
    private Boolean completed;

}
