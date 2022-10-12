package com.yash.assignment2.eight;

public class FinalizeMethodObject {
	
	@Override
	protected void finalize() {
		System.out.println("Finalize called");
	
	}
	public static void main(String[] args) {
		FinalizeMethodObject obj = new FinalizeMethodObject();   
	        System.out.println(obj.hashCode());   
	        obj = null;   
	            
	        System.gc();   
	        System.out.println("end of garbage collection");   
	}


}
