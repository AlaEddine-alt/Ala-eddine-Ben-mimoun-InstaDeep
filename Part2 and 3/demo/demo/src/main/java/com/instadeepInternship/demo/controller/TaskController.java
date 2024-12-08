package com.instadeepInternship.demo.controller;


import com.instadeepInternship.demo.model.Task;
import com.instadeepInternship.demo.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping()
    public Task getTask(int Id) {
    return taskService.getTask(Id);
    }

    @GetMapping
    public List<Task> getTasks(String criteria) {
        return taskService.getTasks(criteria);
    }

    @PostMapping
    public void addTask(@RequestBody Task task) {
        taskService.addTask(task);
    }

    @PostMapping
    public Task updateTask(Task task){
        return taskService.updateTask(task);
    }

    @DeleteMapping
    public void deleteTask(int Id) {
        taskService.deleteTask(Id);
    }


}
