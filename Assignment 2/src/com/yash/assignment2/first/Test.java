package com.yash.assignment2.first;

public class Test {

	public static void main(String[] args) {
		
		//Calories, Carbohydrate, Fiber, Sugar, Fat, Protein, vitamins 
		
				String sourfruit[]= {"15%calories","15%carbohydrate","12%fiber" ,"15%sugar", "3%fat" ,"9%protein" ,"12%vit"};
				String sweetfruit[]= {"13%calories","17%carbohydrate","26%fiber" ,"43%sugar", "5%fat" ,"5%protein" ,"10%vit"};
				
				SourFruit sof=new SourFruit("Green Mango", "Green", sourfruit, "15%sugar");

				SweetFruit swf=new SweetFruit("Apple", "Red", sweetfruit, "40%sugar");
				
				sof.display(sof);
				swf.display(swf);
				
	}
}
