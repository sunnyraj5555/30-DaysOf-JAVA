import java.util.Scanner;
import java.util.*;
public class DAY2 
{
		public static void main(String[] args) 
		{
		Scanner s = new Scanner(System.in);
			
			System.out.println("CSE-Computer Science || ME-Mechanical || CE-Chemical Engeniring");
			System.out.println("Enter Your Branch from (CSE/ME/CE) : ");
			String Branch = s.nextLine();
			
			System.out.println("Enter Your Year (in Roman) : ");
			String Year = s.nextLine();
			
			System.out.println("Enter Your Semester (in Words) : ");
			int Semester = s.nextInt();
	switch(Branch)
			{
			case "CSE":
			  switch(Year)
			  {
			  case "I":
				  switch(Semester)
				  {
				  case 1:
					  System.out.println("SUBJECTS: C/Engeniering Mathematics/Physics I /Chemistry1 I");
					  break;
				  case 2:
					  System.out.println("SUBJECTS: C++/Mathematics II /Physics II/Chemistry II");
					  break;
				  }
				  break;
			case "II":
				  switch(Semester)
				  {
				  case 3:
					  System.out.println("SUBJECTS: JAVA/ Mathematics III / Computer NETWORKS  ");
					  break;
				  case 4:
					  System.out.println("SUBJECTS: Kotlin/Descreate Mathematics/Operating System /ADS");
					  break;
				  }
				  break;
			case "III":
				  switch(Semester)
				  {
				  case 5:
					  System.out.println("SUBJECTS: Python/ DBMS / TOC /Computer Network");
					  break;
				  case 6:
					  System.out.println("SUBJECTS: C#/ HTML5 / CSS / JAVASCRIPT");
					  break;
				  }
				  break;
			case "IV":
				  switch(Semester)
				  {
				  case 7:
					  System.out.println("SUBJECTS: Ruby/ Introguction to Game Development / Game Design  ");
					  break;
				  case 8:
					  System.out.println("SUBJECTS: Placement Course/ Revision Course");
					  break;  
				  }
				  break;  
			  }
			break;
			case "ME":
				  switch(Year)
				  {
				  case "I":
					  switch(Semester)
					  {
					  case 1:
						  System.out.println("SUBJECTS: C/Engeniering Mathematics/Physics I /Chemistry1 I");
						  break;
					  case 2:
						  System.out.println("SUBJECTS: C++/Mathematics II /Physics II/Chemistry II");
						  break;
					  }
					  break;
			 case "II":
					  switch(Semester)
					  {
					  case 3:
						  System.out.println("SUBJECTS: JAVA / Mathematics III / Thermodynamics ");
						  break;
					  case 4:
						  System.out.println("SUBJECTS: Mechanics I /Descreate Mathematics/ Atomic Structure / Kinematics II");
						  break;
					  }
					  break;
				  case "III":
					  switch(Semester)
					  {
					  case 5:
						  System.out.println("SUBJECTS: Mechanics II / Modern Physics / Kinematics II");
						  break;
					  case 6:
						  System.out.println("SUBJECTS: X ray / Rotation Mechanics I");
						  break;
					  }
					  break;
				  case "IV":
					  switch(Semester)
					  {
					  case 7:
						  System.out.println("SUBJECTS: Circular Motion / Gravitation / Rotation Mechanism II");
						  break;
					  case 8:
						  System.out.println("SUBJECTS: Placement Course/ Revision Course");
						  break;  
					  }
					  break;  
				  }
				break;
		case "CE":
				  switch(Year)
				  {
				  case "I":
					  switch(Semester)
					  {
					  case 1:
						  System.out.println("SUBJECTS: C/Engeniering Mathematics/Physics I /Chemistry1 I");
						  break;
					  case 2:
						  System.out.println("SUBJECTS: C++/Mathematics II / Physics II / Chemistry II");
						  break;
					  }
					  break;
				  case "II":
					  switch(Semester)
					  {
					  case 3:
						  System.out.println("SUBJECTS: Chemical Kinectics / Chemical Energetics / Thermodynamics ");
						  break;
					  case 4:
						  System.out.println("SUBJECTS: Real Gas / Ideal Gas / Mole Concept ");
						  break;
					  }
					  break;
				  case "III":
					  switch(Semester)
					  {
					  case 5:
						  System.out.println("SUBJECTS: Chemical Bonding / Molecular Orbital Theory / Complex Compound ");
						  break;
					  case 6:
						  System.out.println("SUBJECTS: Chemical Engeniering / Alchohal Ether ");
						  break;
					  }
					  break;
				  case "IV":
					  switch(Semester)
					  {
					  case 7:
						  System.out.println("SUBJECTS: Organic Compound / Organic Lab ");
						  break;
					  case 8:
						  System.out.println("SUBJECTS: Placement Course/ Revision Course ");
						  break;  
					  }
					  break;  
				  }
				break;
			 }
		}			
	}

