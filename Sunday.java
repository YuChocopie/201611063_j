import java.util.Calendar; 
class SunDay{ 
	public void countSunday(){ 
		int sunday = 0; 
		Calendar c = Calendar.getInstance(); 
		for(int y = 1901; y <= 2000; y++){ 
			for(int e = 0; e < 12; e++){ 
				c.set(y,e,1); 
			if(c.get(Calendar.DAY_OF_WEEK)==1){ 
					sunday+=1; 
				} 
			} 
		} 
		System.out.println("1901.01.01 ~ 2000.12.31 first Sunday : "+sunday); 
	} 
	public static void main(String[] args){ 
		SunDay s = new SunDay(); 
		s.countSunday(); 
  }
} 
