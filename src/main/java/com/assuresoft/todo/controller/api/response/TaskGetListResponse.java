package com.assuresoft.todo.controller.api.response;

import com.assuresoft.todo.persistence.Task;

import java.util.List;

public class TaskGetListResponse {
    private List<Task> allTasks;

    public TaskGetListResponse(List<Task> allTasks) {
        this.allTasks = allTasks;
    }

    public List<Task> getAllTasks() {
        return allTasks;
    }

    public void setAllTasks(List<Task> allTasks) {
        this.allTasks = allTasks;
    }
}
