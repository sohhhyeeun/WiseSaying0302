package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Saying> arr = new ArrayList<>();

        System.out.println("== 명언 앱 ==");

        long lastNum = 0;
        while (true) {
            System.out.print("명령) ");
            String regist = sc.nextLine().trim();
            //.trim(): 왼쪽, 오른쪽 공백 제거

            if (regist.equals("등록")) {
                long num = lastNum + 1;

                System.out.print("명언 : ");
                String famSaying = sc.nextLine().trim();
                System.out.print("작가 : ");
                String writer = sc.nextLine().trim();
                System.out.printf("%d번 명언이 등록되었습니다.\n", num);
                arr.add(new Saying(num, famSaying, writer)); //목록으로 불러오기 위해 필요한 작업

                lastNum++;
            }

            if (regist.equals("목록")) {
                System.out.println("번호 / 작가/ 명언");
                System.out.println("--------------------");
                for (Saying saying : arr) {
                    System.out.printf("%d / %s / %s\n", saying.getNum(), saying.getFamSaying(), saying.getWriter());
                }
            }

            if (regist.equals("종료"))
                break;
        }
    }
}
