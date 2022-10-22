

var arr =Array<number>;

arr =[11,22,331,55,1,7,];

let smallestNum = array[0];
let secondSmallestNum = 0;
for (let i = 1; i < arr.length; i++) {
  if (arr[i] < smallestNum) {
    secondSmallestNum = smallestNum;
    smallestNum = arr[i];
  } else if (arr[i] !== smallestNum && arr[i] < secondSmallestNum) {
    secondSmallestNum = arr[i];
  }
}
