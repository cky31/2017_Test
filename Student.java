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

        return "�л����� [�а�=" + department + ", �й�=" + id + "]"; 

     } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner scan = new Scanner(System.in);       

	       String department; 

	      int id; 

	      System.out.println("�а��� �Է��Ͻÿ�."); 

	      department = scan.nextLine(); 

	       System.out.println("�й��� �Է��Ͻÿ�."); 

	       id = scan.nextInt(); 
	      Student s1 = new Student(department, id); 

	       System.out.println(s1); 

	       scan.close(); 
	
	}

}
