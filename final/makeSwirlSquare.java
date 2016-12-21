import ch.aplu.turtle.*; 
class makeSwirlSquare{ 
	Turtle t1 = new Turtle(); 
	void SwirlSquare(int size,int bigger,int turns,double degree) {
	    int nBigger=2;
	    for(int i=0;i<turns;i++) {
	        if (i%nBigger!=0) {
	            size+=bigger;
	        }
	        t1.forward(size);
	        t1.right(degree);
	        System.out.printf("%d-%d\n", i,size);
	    }
	}
	public static void main(String[] args) {
		makeSwirlSquare s = new makeSwirlSquare(); 
 		s.SwirlSquare(20,20,40,90); 
	}
}