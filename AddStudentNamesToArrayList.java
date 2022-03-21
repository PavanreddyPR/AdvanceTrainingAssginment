package pack6;

import java.util.ArrayList;
import java.util.List;

public class AddStudentNamesToArrayList
 {
   
	   public static void main(String[] args) 
	   {
	      List studentList = new ArrayList();
	      
	      studentList.add("Abhi");
	      studentList.add("Bob");
	      studentList.add("Mounika");
	      studentList.add("Dom");
	      studentList.add("Emma");
	      
	      if(studentList.contains("Mounika")) 
	      {
	         System.out.println("The element Mounika is available in the ArrayList");
	      }
	      
	      else 
	      {
	         System.out.println("The element Mounika is not available in the ArrayList");
	      }
	      
	      if(studentList.contains("Pavan")) 
	      {
	         System.out.println("The element Pavan is available in the ArrayList");
	      }
	      else 
	      {
	         System.out.println("The element Pavan is not available in the ArrayList");
	      }
	   }
	}