package com.example.todotaskdemo.service;

import com.example.todotaskdemo.dao.ToDoTaskDAO;
import com.example.todotaskdemo.entity.ToDoTask;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoTaskServiceImpl implements ToDoTaskService {

  ToDoTaskDAO toDoTaskDAO;

  @Autowired
  public ToDoTaskServiceImpl(ToDoTaskDAO toDoTaskDAO) {
    this.toDoTaskDAO = toDoTaskDAO;
  }

  @Override
  public List<ToDoTask> retriveToDoTasksList() {
    return toDoTaskDAO.getToDoTaskList();
  }

  @Override
  public ToDoTask findToDoTaskById(Integer id) {
    return toDoTaskDAO.getToDoTaskById(id);
  }

  @Override
  @Transactional
  public ToDoTask createToDoTask(ToDoTask toDoTaskToCreate) {
    return toDoTaskDAO.save(toDoTaskToCreate);
  }

  @Override
  @Transactional
  public ToDoTask updateTodoTask(ToDoTask toDoTaskToUpdate) {

    return toDoTaskDAO.save(toDoTaskToUpdate);
  }

  @Override
  @Transactional
  public void deleteTodoTask(Integer id) {

    toDoTaskDAO.delete(id);
  }
}
