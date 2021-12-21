package com.assuresoft.todo.controller.api.response;

public class TaskCreateResponse {
    private String taskTitle;
    private  Long taskId;

    public TaskCreateResponse(String task, Long taskId) {
        this.taskTitle = task;
        this.taskId = taskId;
    }

    public void setTaskTitle(String taskTitle){
          this.taskTitle = taskTitle;
    }
    public void setTaskId(Long taskId){
        this.taskId = taskId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public String getTaskTitle() {
        return taskTitle;
    }
}
