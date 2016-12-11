package com.sd.io; 
import java.io.*; 
import java.util.*; 

public class FileRead { 
  public static void main(String[] args) throws Exception { 
		try{ 
			Scanner f=new Scanner(new File("test.txt")); 
			boolean s; 
			while((s=f.hasNext()) !=false){ 
			System.out.println(f.nextLine()); 
			} 
			f.close(); 
		} catch (FileNotFoundException e) { 
			System.out.println("File not found."); 
		} 
	} 
} 