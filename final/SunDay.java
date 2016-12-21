import java.util.*; 
class SunDay{ 
	void countSunday(){ 
		int sunday = 0; 
		Calendar c = Calendar.getInstance(); 
		for(int y=1801; y<=2000; y++){ 
			for(int m=0; m<12; m++){ 
				c.set(y,m,1); 
				if(c.get(Calendar.DAY_OF_WEEK)==1){ 
					sunday=sunday+1; 
				} 
			} 
		} 
		System.out.println("1801.01.01 ~ 2000.12.31 Sunday : "+sunday); 
	} 
	public static void main(String[] args){ 
		SunDay sd = new SunDay(); 
		sd.countSunday(); 
	} 
} 
