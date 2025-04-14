package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello, World!");
    int neededTime = 15;
    List<LocalDateTime> times = new ArrayList<>();

    LocalDateTime time = LocalDateTime.of(2025, 7, 25, 13, 0);
    LocalDateTime lastTime = LocalDateTime.of(2025, 7, 25, 15, 0);
    for (; time.isBefore(lastTime); time = time.plusMinutes(neededTime)) {
      times.add(time);
    }

    LocalDateTime time2 = LocalDateTime.of(2025, 7, 26, 13, 0);
    LocalDateTime lastTime2 = LocalDateTime.of(2025, 7, 26, 13, 30);
    for (; time2.isBefore(lastTime2); time2 = time2.plusMinutes(neededTime)) {
      times.add(time2);
    }
    System.out.println(times);

    Map<LocalDateTime, String> studentData = new HashMap<>();
    List<Object> student1 = List.of(1, "佐藤", "○", "○", "×", "○", "×", "×", "○", "×", "×", "○");
    List<Object> student2 = List.of(2, "鈴木", "×", "○", "○", "×", "○", "○", "○", "○", "○", "○");
    List<Object> student3 = List.of(3, "高橋", "○", "×", "○", "×", "×", "○", "×", "×", "×", "×");
    List<Object> student4 = List.of(4, "小林", "○", "○", "○", "×", "○", "×", "○", "○", "○", "○");
    List<Object> student5 = List.of(5, "田中", "○", "×", "×", "×", "○", "○", "○", "○", "×", "○");
    List<Object> student6 = List.of(6, "大森", "×", "○", "○", "○", "○", "×", "○", "×", "○", "○");
  }


}