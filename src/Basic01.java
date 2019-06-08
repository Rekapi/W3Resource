package Basic01;

import java.io.Console;
import java.util.Scanner;


//import java.util.Scanner;
public class Basic01 {
	public static final Scanner scan = new Scanner(System.in);
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
    	
    	
    	/* 19. Converting Decimal number to Binary
       	Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        DecToBi(a);*/
    	
    	/* 22. converting from binary number to decimal number 
    	int sum =0;
    	Scanner scan = new Scanner(System.in);
    	String binary = scan.nextLine();
    	String[] s_array = binary.split("");
    	Integer[] a = new Integer[s_array.length];
    	
    	for(int i=0; i<a.length;i++) {
    		a[i] = Integer.parseInt(s_array[i]);
    		
    		int y = (int) Math.pow(2, i);
    		 int result = y * a[i];
    		 sum +=result;
    	}
    	System.out.println(sum);*/
    	
    	/* 33. compute the sum of the digits of an integer
    	int sum =0;
    	Scanner scan = new Scanner(System.in);
    	String num = scan.nextLine();
    	String[] arr_String = num.split("");
    	Integer[] a = new Integer[arr_String.length];
    	for(int i =0; i<a.length;i++) {
    		a[i] = Integer.parseInt(arr_String[i]);
    		sum += a[i];
    	}
    	System.out.println(sum);*/
    	
    	// 37. reverse a String 
    	/*String Phrase = scan.nextLine();
    	char[] ConvertedString = Phrase.toCharArray();
    	for(int i =ConvertedString.length -1; i>=0; i--) {
    		char rev_Char = ConvertedString[i];
    		System.out.print(rev_Char);
    	}
    	System.out.println("");*/
    	
    	// 38.count the letters, spaces, numbers and other characters of an input string. 
    //	count(Phrase);
    	
    	/*42. writting your password with hidden character
    	Console cons;
    	if((cons = System.console()) != null) {
    		char[] pass_word= null;
    		try {
    			pass_word = cons.readPassword("Input your password :");
    			System.out.println("your password was : " + new String(pass_word));
    		}finally {
    			if(pass_word != null) {
    				java.util.Arrays.fill(pass_word, ' ');
    			}
    		}
    	}else {
    		throw new RuntimeException("Cant get password..NO Console");
    	}*/
		
		/* 48. program that print the odd numbers from 1 to 99
		for(int i =0; i<100; i++) {
			if(i %2 !=0) {
				System.out.println(i);
			}
		}*/
		
		/* 49. program accept number and check the number is even if even write 1 if odd write 0
		int num = scan.nextInt();
		checkNum(num);*/
		
		/* 58. program to captalize the first letter on a sentence 
		String phrase = scan.nextLine();
		String upper_Case = "";
		@SuppressWarnings("resource")
		Scanner linescan = new Scanner(phrase);
		while(linescan.hasNext()) {
			String word = linescan.next();
			upper_Case += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
		}
		System.out.println(upper_Case.trim());*/
		
		/* 59. program to lower case all the senetence 
		phrase = phrase.toLowerCase();
		System.out.println(phrase);*/
		
		// 84. program to take three characters from string and add tht three characters to the begining and to the end
		// example :python --> honpythonhon
		String word = scan.nextLine();
		String lastThree = word.substring(3, 6);
		System.out.println(lastThree + word +lastThree );
		
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
    // 22. converting from binary number to decimal number 
    
    // power method 
    public static void pow(int x) {
    	int sum = 0;
    	for(int i =0; i<=5;i++) {
    		int y = (int) Math.pow(x, i);
    		sum += y;
    	}
    	System.out.println("The Result is : " + sum);
    }
    
    // power method for Ex. 22 
    public static void power(double x) {
    	double sum = 0;
    	for(int i =0; i<=9;i++) {
    		double y = Math.pow(x, i);
    		sum += y;
    	}
    	System.out.println("The Result is : " + sum);
    }
    
	// 38.count the letters, spaces, numbers and other characters of an input string. 
	public static void count(String phrase) {
    	
    	char[] chr = phrase.toCharArray();
    	int letter =0;
    	int spaces =0;
    	int numbers = 0;
    	int other =0;
    	// looping thought the character array 
    	for(int i=0; i<chr.length;i++) {
    		if(Character.isLetter(chr[i])) {
    			letter++;
    		}
    		else if(Character.isSpaceChar(chr[i])) {
    			spaces++;
    		}
    		else if(Character.isDigit(chr[i])) {
    			numbers++;
    		}
    		else {
    			other++;
    		}
    	}
    	System.out.println("Number of letters on the sentence is :" + letter);
		System.out.println("Number of spaces on the sentence is :" + spaces);
		System.out.println("Number of numbers on the sentence is :" + numbers);
		System.out.println("Number of other characters on the sentence is :" + other);
    	System.out.println("");
    }
	
	// 49. program accept number and check the number is even if even write 1 if odd write 0
	public static void checkNum(int num) {
		if(num%2 ==0) {
			System.out.println(1);
		}else if (num%2 != 0) {
			System.out.println(0);
		}
	}

}
