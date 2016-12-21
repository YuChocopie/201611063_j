class C3and5{ 
	int sum = 0; 
	void cal(int degree){ 
		for(int i=0; i<degree; i++){ 
			if(i%3==0 || i%5==0) { 
				sum = sum + i; 
			} 
		} 
		System.out.printf("Calculate %d\n", sum); 
	} 
	public static void main(String[] args){ 
		C3and5 m = new C3and5(); 
		int range = 1000; 
		m.cal(range); 
	} 
} 
