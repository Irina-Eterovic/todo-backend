package com.assuresoft.todo.dto;

import lombok.*;

import java.time.OffsetDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class TaskDTO {
    private Long taskId;
    private String title;
    private OffsetDateTime dueDate;
    private OffsetDateTime createdDate;
    private Boolean completed;
}
