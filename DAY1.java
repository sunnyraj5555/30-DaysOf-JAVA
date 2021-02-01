import java.util.Scanner;
import java.util.Arrays;
public class DAY1 {

	public static void main(String[] args) {
		
		int m[] = new int[6];
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0; i<6; i++)
		{
			System.out.println("Enter The marks of" +" "+ (i+1) +" "+ "Subjects: ");
			m[i] = sc.nextInt();
			
		}
		
	}

}
