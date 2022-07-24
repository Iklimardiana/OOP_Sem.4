
import java.util.Scanner;
public class praktikum4_susunbilangan {

     public static int sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        System.out.print(sumDigits(n));
        input.close();
    }
    // public static int sumDigits(long n){
    //     int sum=0;
    //     for (int i=1; i<=n; i++){
    //         sum+=i;
    //     }
    //     return sum;
    // }

    // public static void main(String[] args){
    //     Scanner input = new Scanner(System.in);
    //     long n = input.nextLong();
    //     long q = sumDigits(n);
    //     System.out.print(q);
    // }
//     public static void main(String arg[])	
// 	{
// 	    long n,s;
//              	    Scanner sc=new Scanner(System.in);
// 	    System.out.println("Enter a number ");
//                    n=sc.nextLong();
// 	    s=sum(n);
// 	    System.out.println("Sum of digits of a number is "+s);
                   	  
// 	}
// 	static int sum(long num)
// 	{
// 	int sum=0;
// 	    while(num!=0)
// 	    {
// 		sum+=num%10;
// 		num/=10;
// 	    }
// 	return sum;
// 	}
}
