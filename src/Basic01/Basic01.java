package Basic01;

import java.util.Scanner;

public class Basic01 {
    public static void main(String[] args) {
        // 7. program that takes number as input and prints its multiplications table upto 10
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for(int i =1; i<= 10;i++){
            int result = x*i;
            System.out.println(x + " x " + i + " =  " + result);
        }
        System.out.println("");
    }
}
