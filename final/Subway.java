public class Subway{ 
	int lum; 
	public void setLine(int l){ 
		lum = l; 
	}
	public void subwayRun(){ 
		System.out.println(lum + " line is run!"); 
	} 
 
	public static void main(String[] args) {
		Subway s = new Subway(); 
		s.setLine(4); 
		s.subwayRun();
	}	
}
 
 

 
