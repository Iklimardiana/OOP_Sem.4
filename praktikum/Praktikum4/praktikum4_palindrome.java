import java.util.Scanner;
public class praktikum4_palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
         int number = input.nextInt();
        if (isPalindrome(number)) {
            System.out.print("Polindrome");
        } else {
            System.out.print("Is not Polindrome");
        }
        input.close();
    }

    public static int reverse(int number){
        // Scanner input = new Scanner(System.in);
        //         int a = input.nextInt();
                int b = 0;
                int c;
                // int temp = number;
                while(number>0){
                c = number % 10;
                b = ( b*10 )+c;
                number = number/10;
                }
        return b;
    }

    public static boolean isPalindrome(int number){
        return number == reverse(number);
        }
}

