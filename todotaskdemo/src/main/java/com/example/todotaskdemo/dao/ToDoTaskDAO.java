package com.example.todotaskdemo.dao;

import com.example.todotaskdemo.entity.ToDoTask;

import java.util.List;

public interface ToDoTaskDAO {

  List<ToDoTask> getToDoTaskList();

  ToDoTask getToDoTaskById(Integer id);

  ToDoTask save(ToDoTask toDoTaskToCreate);

  void delete(Integer id);
}
