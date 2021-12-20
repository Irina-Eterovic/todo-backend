package com.assuresoft.todo.persistence.repository;

import com.assuresoft.todo.persistence.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
