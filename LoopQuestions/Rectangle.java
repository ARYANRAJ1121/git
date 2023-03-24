package LoopQuestions;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row");
        int l = sc.nextInt();
        System.out.println("enter column");
        int c = sc.nextInt();
        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}