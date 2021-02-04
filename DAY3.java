import java.util.Scanner;

public class DAY3 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number: ");
			int n = sc.nextInt();
			
			for(int i=2; i<n; i++)
			{
				if(n%i != 0)
				{
					System.out.println("The Number Is Not Prime!");
				}
				else 
				{
					System.out.println("The Number Is Prime!");
				}
				break;
			}
			
			
		}
}
