package com.ll;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.print("명령) ");
            String regist = sc.nextLine().trim();
            //.trim(): 왼쪽, 오른쪽 공백 제거

            if (regist.equals("종료"))
                break;
        }
    }
}
