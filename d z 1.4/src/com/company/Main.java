package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите  число a: ");
        System.out.println("Введите  число b : ");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        float b = sc.nextInt();
        if (b >= a - a / 10 && b <= a + a/10) {
            System.out.println("Число b близко к числу a в пределах десяти процентов");
        } else {
                System.out.println("Число b вышло за пределы десяти процентов относительно числа а");
            }
    }
}
