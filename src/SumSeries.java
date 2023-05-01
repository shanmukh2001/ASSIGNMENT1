import java.util.Scanner;
public class SumSeries{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double sum=0.0;
		for(int i=1;i<=n;i++)
            {
            long f = 1;
            for (int j = 1; j <= i; j++) {
                f *= j;
            }
            sum += (1.0 / f);
        }
        System.out.println("Sum=" + sum);
}
}

