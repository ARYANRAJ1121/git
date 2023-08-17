package ImportantPatternQuestion;

import java.util.Scanner;

public class ImpFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter an integer: ");
        int n = sc.nextInt();
        int x=0,y=1,z=0,term=1;
        while (term<=n){
            System.out.println(term);
            x=y;
            y=z;
            z=x+y;
            term=term+1;
        }


    }
}
