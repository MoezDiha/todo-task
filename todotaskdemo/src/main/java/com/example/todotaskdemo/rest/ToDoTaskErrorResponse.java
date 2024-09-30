package com.example.todotaskdemo.rest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class ToDoTaskErrorResponse {

  private int status;
  private String message;
  private long timeStamp;

  public ToDoTaskErrorResponse(int status, String message, long timeStamp) {
    this.status = status;
    this.message = message;
    this.timeStamp = timeStamp;
  }
}
