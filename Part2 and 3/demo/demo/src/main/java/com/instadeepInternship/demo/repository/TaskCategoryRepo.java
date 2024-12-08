package com.instadeepInternship.demo.repository;

import com.instadeepInternship.demo.model.TaskCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TaskCategoryRepo extends JpaRepository<TaskCategory, Integer>, JpaSpecificationExecutor<TaskCategory> {
}
