import java.util.Scanner;
import java.util.Arrays;
public class DAY1 {

	public static void main(String[] args) {
		
		int m[] = new int[6];  // Creating Array
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0; i<6; i++)
		{
			System.out.println("Enter The marks of" +" "+ (i+1) +" "+ "Subjects: ");
			m[i] = sc.nextInt();
			
		}

		for (i = 0; i < 6; i++) 
        {
            for (int j = i + 1; j < 6; j++) 
            {
                if (m[i] < m[j]) 
                {
               	    int temp;
                    temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                }
            }
        }
		
		System.out.print("First 5 HIGHEST marks of Subjects Are :");
        for (i = 0; i <5; i++) 
        {
            System.out.print(m[i] + ",");
        }
    
	}

}
