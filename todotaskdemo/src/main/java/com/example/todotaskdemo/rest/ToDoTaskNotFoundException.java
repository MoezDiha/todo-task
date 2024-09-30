package com.example.todotaskdemo.rest;

public class ToDoTaskNotFoundException extends RuntimeException {

  public ToDoTaskNotFoundException(String message) {
    super(message);
  }

  public ToDoTaskNotFoundException(Throwable cause) {
    super(cause);
  }

  public ToDoTaskNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }
}
