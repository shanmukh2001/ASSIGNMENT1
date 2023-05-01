
import java.util.Scanner;
public class NthArmstrong {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r,sum=0,l=0,num;
		num=n;
		while(n!=0)
		{
		r=n%10;
		l++;
		n=n/10;
		}
		n=num;
		while(n!=0)
		{
		r=n%10;
		sum=sum+rem*rem*rem; 
		n=n/10;
		}
		if(sum==num)
			System.out.println("Armstrog");
		else
			System.out.println("Not Armstrog");



	}

}
