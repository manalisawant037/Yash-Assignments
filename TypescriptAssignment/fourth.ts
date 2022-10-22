//Create an arrow function by which you have to sort the given numbers

var arr= [4,1,88,34,7];
	  var n = arr.length;
        var temp = 0;  
		console.log("Sorted Numbers ");
         for(var i=0; i < n; i++){  
                 for(var j=i+1; j <n; j++)
				 {  
                          if(arr[i] > arr[j])
						  {  
                                 //swap elements  
                                 temp = arr[i];  
                                 arr[i] = arr[j];  
                                 arr[j] = temp;  
                          }  
                       						
                 }  console.log(arr[i]);
         }  