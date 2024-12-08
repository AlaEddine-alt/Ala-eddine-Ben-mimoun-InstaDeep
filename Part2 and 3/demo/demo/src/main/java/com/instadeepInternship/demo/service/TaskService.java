package com.instadeepInternship.demo.service;

import com.instadeepInternship.demo.model.Task;
import com.instadeepInternship.demo.model.TaskCategory;

import java.util.List;

public interface TaskService {

    public Task getTask(int id);
    public List<Task> getTasks(String criteria);
    public Task addTask(Task task);
    public Task updateTask(Task task);
    public void deleteTask(int id);
    //public Task AssignTaskCategoryToTask(int taskId, TaskCategory taskCategory);
}
