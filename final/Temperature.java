class Temperature{ 
	void exchange(String x, float y){ 
		float a; 
		if(x.equals("F")){ 
			a = (y-32f)/1.8f; 
			System.out.println("User input "+x+" "+y); 
			System.out.println("Exchange "+"C "+a); 
		} 
 	else if(x.equals("C")){ 
			a = (y*1.8f)+32f; 
			System.out.println("User input "+x+" "+y); 
			System.out.println("Exchange "+"F "+a); 
		} 
		else{ 
			System.out.println("Error"); 
		} 
	} 
	public static void main(String[] args){ 
		Temperature a = new Temperature(); 
		a.exchange("C", 50.0f); 
		Temperature b = new Temperature(); 
		b.exchange("F", 50.0f); 
	} 
} 
