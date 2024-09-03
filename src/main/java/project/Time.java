package project;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("포맷된 날짜와 시간: " + formattedDateTime);
    }
}

