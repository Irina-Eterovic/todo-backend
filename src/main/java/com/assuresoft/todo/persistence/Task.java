package com.assuresoft.todo.persistence;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.OffsetDateTime;
@Getter
@Setter
@RequiredArgsConstructor
@Data
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id", nullable = false)
    private Long taskId;
    private String title;
    @Column(nullable = false, name = "due_date")
    private OffsetDateTime dueDate;
    @Column(nullable = false, name = "created_date")
    private OffsetDateTime createdDate;
    @Column(nullable = false)
    private Boolean completed;
}
