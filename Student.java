package test;

import java.util.Scanner;
public class Student {
	
	private String department; 

    private int id;
	
    public Student(String department, int id) { 

        this.department = department; 

        this.id = id; 

     } 

     @Override 

     public String toString() { 

        return "학생정보 [학과=" + department + ", 학번=" + id + "]"; 

     } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner scan = new Scanner(System.in);       

	       String department; 

	      int id; 

	      System.out.println("학과를 입력하시오."); 

	      department = scan.nextLine(); 

	       System.out.println("학번을 입력하시오."); 

	       id = scan.nextInt(); 
	      Student s1 = new Student(department, id); 

	       System.out.println(s1); 

	       scan.close(); 
	
	}

}
