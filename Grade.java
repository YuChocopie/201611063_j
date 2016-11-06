class Grade{ 
  char result; 
	char computeGrade(double marks){ 
		if(90<= marks && marks <=100){ 
			result = 'A'; 
			return result; 
		} 
		else if(80<= marks && marks <90){ 
			result = 'B'; 
  		return result; 
		} 
		else if(70<= marks && marks <80){ 
			result = 'C'; 
			return result;		} 
		else if(60<= marks && marks <70){ 
			result = 'D'; 
			return result; 
		} 
		else{ 
			result = 'F'; 
			return result; 
		} 
	} 
	void sayGrade(char a){ 
		System.out.println("Grade is "+a); 
	} 
	public static void main(String[] args){ 
		Grade g = new Grade(); 
		double[] marks = {95.0, 83.0, 75.0, 61.0, 55.0}; 
		for(double m:marks){ 
			char r = g.computeGrade(m); 
			g.sayGrade(r); 
		} 
	} 
} 
