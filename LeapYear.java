class LeapYear { 
	public void calaulatorLeap(int year) { 
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) { 
			System.out.printf("%d is leap year\n", year); 
		}
		else{
		  System.out.printf("%d is not leap year\n", year);
		} 
	}	 
	public static void main(String[] args) { 
		LeapYear ly = new LeapYear();  
		int[] year = {1700,1800,1900,1967,1985,2000,2004,2222}; 
		for(int i=0; i<year.length; i++){ 
      ly.calaulatorLeap(year[i]); 
	  }
  }
}