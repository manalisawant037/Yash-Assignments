//1. Create an arrow function which will take multiple inputs and you have to print he minimum number from it.
var array = [32, 22, 53, 92, 20, 34, 23, 11, 17];
var smallestNum = array[0];
for (var i = 1; i < array.length; i++) {
    if (array[i] < smallestNum) {
        //secondSmallestNum = smallestNum;
        smallestNum = array[i];
    }
}
console.log(smallestNum);
