package com.instadeepInternship.demo.model;

import com.instadeepInternship.demo.enums.TaskPriority;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    private TaskPriority priority;
    private String dueDate;

    @OneToMany(mappedBy = "task")
    @OnDelete(action= OnDeleteAction.CASCADE)
    private List<TaskCategory> taskCategory;



}
