package com.docencia.tasks.adapters.in.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import com.docencia.tasks.adapters.in.api.TaskRequest;
import com.docencia.tasks.adapters.in.api.TaskResponse;
import com.docencia.tasks.adapters.mapper.TaskMapper;
import com.docencia.tasks.business.TaskService;
import com.docencia.tasks.domain.model.Task;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tasks")
@Tag(name = "Tasks API")
@CrossOrigin
@Service
public class TaskController {

    private final TaskService service;
    private TaskMapper mapper;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @Autowired
    public void setMapper(TaskMapper mapper){
        this.mapper=mapper;
    }

    @GetMapping
    @Operation(summary = "Get all tasks")
    public List<TaskRequest> getAll() {
        return null;
    }

    @PostMapping
    @Operation(summary = "Create new task")
    public TaskResponse create(@RequestBody TaskRequest taskRequest) {
        Task task = mapper.toTask(taskRequest);
        task=service.createTask(task);
        return mapper.taskToResponse(task);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update task")
    public TaskResponse update(@PathVariable Long id, @RequestBody TaskResponse task) {
        //task.setCompleted(task.isCompleted());
        //task.setTitle(task.getTitle());
        //task.setDescription(task.getDescription());
        //return service.save(task);
        return null;
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete task")
    public void delete(@PathVariable Long id) {
        service.deleteTask(id);
    }
}
