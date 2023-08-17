package PatternQuestions;

import java.util.Scanner;

public class rectangleprac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int l = sc.nextInt();
        System.out.println("Enter coloumn");
        int n = sc.nextInt();
        for (int i=1;i<=l;i++){
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
