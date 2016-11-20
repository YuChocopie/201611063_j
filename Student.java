import java.util.ArrayList; 
import java.util.Collections; 

class Student { 
	  private String name; 
	  private int studentNum; 
    Student(String name, int snum) { 
		    this.name = name; 
 		    this.studentNum = snum; 
	  } 
	  public String getName() { 
		    return name; 
	  } 
	 
	  public static void main(String[] args) { 
		    ArrayList<String> snameList = new ArrayList<String>(); 
		 
		    Student s1 = new Student("yjk 1", 1); 
		    Student s2 = new Student("yjk 2", 2); 
		 
    		snameList.add(s2.getName()); 
        snameList.add(s1.getName()); 
		 
        Collections.sort(snameList); 
		 
        for (String s : snameList) 
            System.out.println(s); 
      } 
} 