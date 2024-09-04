package project;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Board {
    public static void main(String[] args) {
        // main 메서드는 프로그램의 스위치 역할만 한다.
        BoardApp boardApp = new BoardApp();
        boardApp.run();
    }
}
