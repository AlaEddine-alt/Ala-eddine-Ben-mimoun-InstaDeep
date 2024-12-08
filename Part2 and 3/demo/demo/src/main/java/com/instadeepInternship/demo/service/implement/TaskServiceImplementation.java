package com.instadeepInternship.demo.service.implement;

import com.instadeepInternship.demo.model.Task;
import com.instadeepInternship.demo.model.TaskCategory;
import com.instadeepInternship.demo.repository.TaskRepo;
import com.instadeepInternship.demo.service.TaskService;
import com.instadeepInternship.demo.specifications.TaskSpec;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskServiceImplementation implements TaskService {
    //I used Dependency injection as a pattern to implement IoC, where the control being inverted is setting an object’s dependencies.

    private TaskRepo taskRepo;


    @Override
    public Task getTask(int id) {
        return taskRepo.findById(id).get();
    }

    @Override
    public List<Task> getTasks(String criteria) { // filtering data by certain criteria(duedate etc ..)
        return taskRepo.findAll(TaskSpec.hasCriteria(criteria));
    }

    @Override
    public Task addTask(Task task) {
        return taskRepo.save(task);
    }

    @Override
    public Task updateTask(Task task) {
        return taskRepo.save(task);
    }

    @Override
    public void deleteTask(int id) {
         taskRepo.deleteById(id);
    }

    /* @Override
    public  Task AssignTaskCategoryToTask(int taskId, TaskCategory taskCategory) {
        Task task = taskRepo.findById(taskId).get();
            taskCategory.setTask(task);
            return taskRepo.save(task);


    } */
}
