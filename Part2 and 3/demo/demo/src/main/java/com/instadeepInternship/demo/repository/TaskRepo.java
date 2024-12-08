package com.instadeepInternship.demo.repository;

import com.instadeepInternship.demo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task, Integer> {

}
