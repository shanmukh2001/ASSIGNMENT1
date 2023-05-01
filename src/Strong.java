import java.util.Scanner;
public class Strong{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num,r,sum=0,fact,i,digit;
		num=n;
		while(n!=0)
		{
			fact=1;	
			digit=n%10;
		//complete the code1
			for(i=1;i<=digit;i++) {
		    while(i <= digit) {
            fact = fact * i;
            i++;
         }

         //store the sum value
         sum = sum + fact;

         //removing the digit one by one
         n = n/ 10;
      }
	
		}
		if(sum==num)
			System.out.println("Strong");
		else
			System.out.println("Not Strong");

	}
}
