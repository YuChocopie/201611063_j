public class Triangle { 
	String a, b; 
	StringBuffer s; 
	 
	public Triangle() { 
		a = "*"; 
		b = " "; 
		s = new StringBuffer();
	} 
	
	public void makeTriangle(int n) { 
		for (int i = 0; i < n; i++) { 
			for (int j = n; j > i; j--) 
				s.append(b);			 
			for(int j = 0; j < (2 * i - 1); j++) 
				s.append(a); 
			System.out.printf("%a\n", s.toString()); 
			s.delete(0, s.length()); 
		}		 
	} 	
	
	public static void main(String[] args) { 
		Triangle t = new Triangle(); 
		t.makeTriangle(10); 
	} 
} 
