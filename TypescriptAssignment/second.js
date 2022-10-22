//Create an arrow function by which will take multiple strings and you have print each 
//string along with length of each string
var names = [
    'Manali',
    'Fatima',
    'Hrushikesh',
    'Riya'
];
console.log(names.map(function (names) { return names.length; }));
var movies;
movies = ['RRR', 'Vikram Vedha', 'Pushpa'];
var printStrLength = function (movies) {
    for (var i = 0; i < movies.length; i++) {
        console.log("String is " + movies[i] + " and its length is : " + movies[i].length);
    }
};
printStrLength(movies);
