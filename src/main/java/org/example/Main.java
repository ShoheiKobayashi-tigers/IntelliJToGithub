package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello, World!");

    LocalDateTime time=LocalDateTime.of(2025,7,25,13,0);
    LocalDateTime lastTime=LocalDateTime.of(2025,7,25,15,0);
    int neededTime=15;
    List<LocalDateTime> times=new ArrayList<>();
    for(;!time.isAfter(lastTime);time=time.plusMinutes(neededTime)){
      times.add(time);
    }
    System.out.println(times);


    }
}