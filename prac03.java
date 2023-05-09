package PatternQuestions;

import java.util.Scanner;

public class prac03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row");
        int n = sc.nextInt();
        System.out.println("enter column");
        int c = sc.nextInt();
        for (int i =1;i<=n;i++){
            for (int j =1;j<=c;j++){
                if (i==1||j==1||i==n||j==c){
                System.out.print("*");
            }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
