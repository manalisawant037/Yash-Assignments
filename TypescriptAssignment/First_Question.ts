

//1. Create an arrow function which will take multiple inputs and you have to print he minimum number from it.

	let array = [32, 22, 53, 92, 20, 34, 23, 11, 17];
		let smallestNum = array[0];
		
		for (let i = 1; i < array.length; i++)
		{
			if (array[i] < smallestNum) 
			{
				//secondSmallestNum = smallestNum;
				smallestNum = array[i];
			} 
			
		}
	console.log(smallestNum);
