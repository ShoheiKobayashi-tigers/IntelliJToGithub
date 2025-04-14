package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello, World!");

    LocalDateTime time=LocalDateTime.of(2025,7,25,13,0);
    LocalDateTime lastTime=LocalDateTime.of(2025,7,25,15,0);
    List<LocalDateTime> times=new ArrayList<>();
    times.add(time);
    times.add(lastTime);
    time=time.plusMinutes(15);
    times.add(time);
    System.out.println(times);
    }
}