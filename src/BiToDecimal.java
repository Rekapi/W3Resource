package Basic01;

import java.util.Scanner;

public class BiToDecimal {
	/**
	 * this class is for converting binary numbers to decimal numbers 
	 * the algorthim is designed as following 
	 * 1. take binary numebr from the user as string 
	 * 2. convert string to character array 
	 * 3. reverse the character array 
	 * 4. convert character array into integer array 
	 * 5. implement the power method
	 */

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int sum =0;
		// 1. take input from the user
		Scanner scan = new Scanner(System.in);
		String binary = scan.nextLine();
		// 2. converting string to character array 
		char[] bin_char = binary.toCharArray();
		// 3. reverse the character array 
		char[] temp = new char[bin_char.length];
		for(int i= bin_char.length -1; i>=0;i--) {
			temp[bin_char.length - i -1] = bin_char[i];
		}
		bin_char = temp;
		// 4. convert character array into string 
		// 5. convert string array into integer and then parse from binary to decimal
		String revString = new String(bin_char);
		String[] rev_String_Arr = revString.split("");
		Integer[] a = new Integer[rev_String_Arr.length];
		for(int j =0; j<a.length;j++) {
			a[j] = Integer.parseInt(rev_String_Arr[j]);
			int y = (int) Math.pow(2, j);
   		 	int result = y * a[j];
   		 	sum +=result;
		}
		System.out.println(sum);
    }
	
}

