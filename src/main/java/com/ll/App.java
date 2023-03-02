package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Saying> arr = new ArrayList<>();

        System.out.println("== 명언 앱 ==");

        int num = 1;
        while (true) {
            System.out.print("명령) ");
            String regist = sc.nextLine().trim();
            //.trim(): 왼쪽, 오른쪽 공백 제거

            if (regist.equals("등록")) {
                System.out.print("명언 : ");
                String famSaying = sc.nextLine().trim();
                System.out.print("작가 : ");
                String writer = sc.nextLine().trim();
                System.out.printf("%d번 명언이 등록되었습니다.\n", num);
                arr.add(new Saying(num, famSaying, writer));

                num++;
            }

            if (regist.equals("종료"))
                break;
        }
    }
}

class Saying {
    private int num;
    private String famSaying;
    private String writer;

    public Saying(int num, String famSaying, String writer) {
        this.num = num;
        this.famSaying = famSaying;
        this.writer = writer;
    }
}
