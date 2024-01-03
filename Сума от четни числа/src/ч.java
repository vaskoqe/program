import java.util.Scanner;
public class ч {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Въведи число а");
		long a= input.nextLong();
		int sum=0;
		for (int i=2;i<=a;i+=2) {
			System.out.println(i+" е четно число");
			sum+=i;
			
		}
		System.out.println("Сумата от четните числа е :"+sum);

	}

}
