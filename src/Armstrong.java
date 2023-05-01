
import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;  
        int rem;
	        while(n != 0) {
                  rem = n % 10;
                  sum = sum + (rem * rem * rem);
                  n= n / 10;
         }
		if(sum==n)  //write the correct code inside the bracket
			System.out.println("Armstrong");   
		else  
			System.out.println("Not Armstrong ");   

	}

}
