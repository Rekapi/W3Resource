package Basic01;

import java.util.Scanner;

//import java.util.Scanner;
public class Basic01 {
    public static void main(String[] args) {
        // 7. program that takes number as input and prints its multiplications table upto 10
        /*Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for(int i =1; i<= 10;i++){
            double result = x*i;
            System.out.println(x + " x " + i + " =  " + result);
        }
        System.out.println("");*/
        //System.out.println("the perimeter of the circle = " + perimeter(x));
        //System.out.println("the area of the circle = " + Area(x));
        /*14. American Flag
        for(int j=0; j<8;j++){
            System.out.println("");
            for (int i =0; i<6;i++){
                System.out.print("*"+ " ");
            }
            for (int i =0; i<20;i++){
                System.out.print("=");
            }
        }
        System.out.println("");
        for(int x=0;x<6;x++){
            for(int h=0; h<32;h++){
                System.out.print ("=");
            }
            System.out.println("");
        }*/
        /* 15. swap variables
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input two different numbers  :");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Before Swapping : " + a + " " + b);
        int temp;
        temp = a;
        a = b;
        b= temp;
        System.out.println("After Swapping : " + a + " " + b);*/
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        DecToBi(a);

    }
    // 11. method to calculate perimeter and area of a given circle
    // perimeter method
    public static double perimeter(long radius){
        double per = 2*Math.PI*radius;
        return per;
    }
    // Area method
    public static double Area(long radius){
        double area = Math.PI*radius*radius;
        return area;
    }
    // 15. Swap two variables exercise
    public static void swap(int a,int b){
        int temp;
        temp = a;
        a = b;
        b= temp;
    }
    // 19. converting decimal numbers into binary
    public static void DecToBi(int decimal){
        int[] bin_num = new int[100];
        int i = 1;
        while(decimal != 0){
                bin_num[i++] = decimal%2;
                decimal = decimal/2;
        }
        System.out.print("The Binary number is : ");
        for(int j = i-1; j>0;j--){
            System.out.print(bin_num[j]);
        }
        System.out.println("");
    }
}
