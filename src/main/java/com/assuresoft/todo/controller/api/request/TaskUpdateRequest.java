package com.assuresoft.todo.controller.api.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskUpdateRequest {
    String title;
    Boolean completed;
}
