
import java.util.Scanner;
public class MaxDigit{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int max=0;
		while(n!=0)
		{
	    int rem = n % 10;
            
            //checking maximum digit in number
            if(rem > max) {
                max = rem;
            }
	    n = n/10;
        }
		System.out.println(max);
	}
}

