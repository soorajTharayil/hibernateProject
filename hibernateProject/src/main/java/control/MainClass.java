package control;

import java.util.Scanner;

import dao.Sample;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Sample sample=new Sample();
		
		boolean flag=true;
		while(flag)
		{
			System.out.println("\n..............OPTIONS.................\n\n1.Add Student details\n2.Fetch Student details by Student_Id\n3.Remove Student details by Student_Id\n4.Update Student details by Student_Id"
					+ "\n5.Fetch All Student Details\n6.Delete All Student Details\n7.Exit\n\nEnter any option");
			switch(scanner.nextInt())
			{
			case 1:{
				System.out.println(".................Adding Student Details....................\n");
				System.out.println("Enter the Student_Id");
				int id=scanner.nextInt();
				System.out.println("Enter the Student name");
				String name=scanner.next();
				System.out.println("Enter the Student branch");
				String branch=scanner.next();
				
				sample.addStudent(id,name,branch);
				System.out.println("Added to the Table.......................");
				break;
				
			}
			
			case 2:{
				System.out.println("\n.................Fetching Student Details by Student_Id....................\n");
				System.out.println("Enter the Id");
				int id=scanner.nextInt();
				
				sample.fetchStudent(id);
				break;
			}
			
			case 3:{
				System.out.println("\n.................Removing Student Details by Student_Id....................\n");
				System.out.println("Enter the Id");
				int id=scanner.nextInt();
				
				sample.removeStudent(id);
				System.out.println("Removed from the Table......................");
				break;
			}

			case 4:{
				System.out.println("\n.................Updating Student  Name by Id....................\n");
				System.out.println("Enter the Id");
				int id=scanner.nextInt();
				System.out.println("Enter the new Name");
				String name=scanner.next();
				
				sample.updateStudent(id, name);
				System.out.println("Updated....................");
				break;
			}
			
			case 5:{
				System.out.println("\n.................Fetching all the Employe Details....................\n");
				
				sample.fetchAll();
				break;
			}
			
			case 6:{
				System.out.println("\n.................Deleting all the Employe Details....................\n");
				
				sample.deleteAll();
				System.out.println("All the details are deleted................................");
				break;
			}
			
			case 7:{
				flag=false;
				System.out.println("Thank you..............................................");
				break;
			}
			
			default:{
				System.out.println("Invalid input.........Enter correct option.....");
				break;
			}
			
	       }
		}
		
	}
	
}

