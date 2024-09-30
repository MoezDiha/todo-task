package com.example.todotaskdemo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ToDoTask {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String title;

  private String description;

  @Temporal(TemporalType.DATE)
  private Date deadLine;
}
