//Create an arrow function by which you have to find out average of given N numbers.
var a = [4, 5, 4, 7];
var sum = 0;
for (var i = 0; i < a.length; i++) {
    sum = sum + a[i];
    var avg = sum / a.length;
}
console.log("Sum is : ", sum);
console.log(avg);
