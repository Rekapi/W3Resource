package Methods;
import java.util.Scanner;

    public class Methods{
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            //	int a = scan.nextInt();
            //	int b = scan.nextInt();
            //	int c = scan.nextInt();
            //System.out.println("the smallest numb`er is :" +compareSmall(a,b,c));
            //System.out.println("the average is :" +averageNum(a,b,c));
            System.out.println("Please enter your String");
            String sentence = scan.nextLine();
            System.out.println("the middle is :" + middle(sentence));
            System.out.println("the vowels numbers = " + numberOfVowels(sentence));
            System.out.println("the number of strings = " + numberOfWords(sentence));


        }
        // 1. java method for comparing between 3 numbers and find the smallest number

        public static int compareSmall(int firstnum, int secondnum,int thirdnum){

            return Math.min(Math.min(firstnum,secondnum), thirdnum);
        }
        // 2. method to compute average between three numbers
        public static int averageNum(int firstnum, int secondnum,int thirdnum){

            return (firstnum+secondnum+thirdnum)/3;
        }
        // 3. method to return the middle character into string
        public static String middle(String str){
            int position;
            int length;
            if(str.length() %2 == 0){
                position = str.length()/2 -1;
                length =2;
            }else {
                position =str.length()/2;
                length =1;
            }
            return str.substring(position, position+length);
        }
        //4. method to return the number of vowels
        public static int numberOfVowels(String string) {
            int count = 0;
            for(int i=0; i<string.length();i++) {
                if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u' ) {
                    count++;
                }
            }
            return count;
        }
        //5. method to count all words in sentence
        public static int numberOfWords(String string) {
            int count = 0;
            for(int i=0; i<string.length();i++) {
                if(string.charAt(i) ==' ') {
                    count++;
                }
            }
            count = count +1;
            return count;
        }
    }

