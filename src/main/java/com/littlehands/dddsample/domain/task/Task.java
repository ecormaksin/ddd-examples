package com.littlehands.dddsample.domain.task;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Task {
  private TaskId taskId;
  private String name;
  private TaskStatus taskStatus;
  private int postponeCount;
  private LocalDate dueDate;
}
