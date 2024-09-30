package com.example.todotaskdemo.dao;

import com.example.todotaskdemo.entity.ToDoTask;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoTaskDAOImpl implements ToDoTaskDAO {

  EntityManager entityManager;

  @Autowired
  public TodoTaskDAOImpl(EntityManager entityManager) {
    this.entityManager = entityManager;
  }

  @Autowired


  @Override
  public List<ToDoTask> getToDoTaskList() {

    return entityManager.createQuery("from ToDoTask", ToDoTask.class).getResultList();
  }

  @Override
  public ToDoTask getToDoTaskById(Integer id) {

    return entityManager.find(ToDoTask.class, id);
  }

  @Override
  public ToDoTask save(ToDoTask toDoTaskToCreate) {

    return entityManager.merge(toDoTaskToCreate);
  }

  @Override
  public void delete(Integer id) {

    ToDoTask toDoTaskToRmove = entityManager.find(ToDoTask.class, id);
    entityManager.remove(toDoTaskToRmove);
  }
}
