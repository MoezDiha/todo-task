package com.example.todotaskdemo.rest;

import com.example.todotaskdemo.entity.ToDoTask;
import com.example.todotaskdemo.service.ToDoTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ToDoTaskRestController {

  ToDoTaskService toDoTaskService;

  @Autowired
  public ToDoTaskRestController(ToDoTaskService toDoTaskService) {
    this.toDoTaskService = toDoTaskService;
  }

  @GetMapping("/todo-tasks")
  public List<ToDoTask> retrieveAllTodoTasks() {
    return toDoTaskService.retriveToDoTasksList();
  }

  @GetMapping("/todo-tasks/{toDoTaskId}")
  public ToDoTask retrieveToDoTaskById(@PathVariable int toDoTaskId) {
    ToDoTask toDoTask = toDoTaskService.findToDoTaskById(toDoTaskId);

    if (toDoTask == null) {
      throw new ToDoTaskNotFoundException("ToDoTask id not found -" + toDoTaskId);
    }
    return toDoTask;
  }

  @PostMapping("/todo-tasks")
  public ToDoTask addTodoTask(@RequestBody ToDoTask toDoTask) {
    toDoTask.setId(0);

    return toDoTaskService.createToDoTask(toDoTask);
  }

  @PutMapping("/todo-tasks")
  public ToDoTask updateToDoTask(@RequestBody ToDoTask toDoTask) {
    return toDoTaskService.updateTodoTask(toDoTask);
  }

  @DeleteMapping("/todo-tasks/{toDoTaskId}")
  public void deleteTodoTask(@PathVariable int toDoTaskId) {

    ToDoTask toDoTask = toDoTaskService.findToDoTaskById(toDoTaskId);

    if (toDoTask == null) {
      throw new ToDoTaskNotFoundException("ToDoTask id not found -" + toDoTaskId);
    }
  }

}
