package com.example.todotaskdemo.service;

import com.example.todotaskdemo.entity.ToDoTask;

import java.util.List;

public interface ToDoTaskService {

  List<ToDoTask> retriveToDoTasksList();

  ToDoTask findToDoTaskById(Integer id);

  ToDoTask createToDoTask(ToDoTask toDoTaskToCreate);

  ToDoTask updateTodoTask(ToDoTask toDoTaskToUpdate);

  void deleteTodoTask(Integer id);
}
