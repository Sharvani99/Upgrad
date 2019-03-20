import java.util.*;
import java.lang.*;


public class StudentDemoUpGrad2{

    public static void main(String ...args){
	
	   PriorityQueue<Student> yetToBeServed= new PriorityQueue<Student>();
	
	     Scanner scan=new Scanner(System.in);
		 System.out.println("please enter number of events");
		 int noOfEvents=scan.nextInt();
		 
		 for(int event=1;event<=noOfEvents;event++){
		                        
								Scanner sc=new Scanner(System.in);
								

								System.out.println("please enter which event you want to perform ....Enter/Served");
							 
								String input=sc.nextLine();
								
								if(input.equalsIgnoreCase("enter")){
								
									System.out.println("enter the name of student and his CGPA");
									String stuDetails=sc.nextLine();
									String[] stuDetailsArr = stuDetails.split(" ");
									String name=stuDetailsArr[0];
									float cgpa=Float.parseFloat(stuDetailsArr[1]);
									Student s=new Student(name,cgpa);
									yetToBeServed.add(s);
								
								
								}else if(input.equalsIgnoreCase("served")){
								
								   yetToBeServed.remove();
								
								}else{
								  
								   System.out.println("please enter a valid input enter/served");
								
								}
		 
		 }//for loop
		 
		 
		 System.out.println("The students who are yet to be served are......");
		 System.out.println(yetToBeServed);
		 
		 
		 
		 
	
	
	
	
	
	}//main


}//class