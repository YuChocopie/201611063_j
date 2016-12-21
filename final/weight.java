class weight{ 
	private float weight; 
	public void setW(float w){ 
		this.weight = w; 
	} 
	private float getW(){ 
		return weight; 
	} 
	public static void main(String[] args) {
		weight w = new weight(); 
		w.setW((float)40.0); 
		System.out.println("Your weight is " + w.getW()); 
	}
} 

