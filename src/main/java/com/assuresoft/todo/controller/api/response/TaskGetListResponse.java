package com.assuresoft.todo.controller.api.response;
import java.util.List;
import com.assuresoft.todo.persistence.Task;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskGetListResponse {
    private List<Task> allTasks;

    public TaskGetListResponse(List<Task> allTasks) {
        this.allTasks = allTasks;
    }

}
