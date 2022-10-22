//Create an arrow function by which you will take input of string and you check given 
//string is palindrome or not
function reverse(str) {
    // variable holds reverse string
    var rev_str = "";
    for (var i = str.length - 1; i >= 0; i--) {
        rev_str += str[i];
    }
    // return reverse string
    return rev_str;
}
//  function checking string is palindrome or not
function is_palindrome(str) {
    var reverse_str = reverse(str);
    if (reverse_str === str) {
        console.log("passed string is palindrome ");
    }
    else {
        console.log("passed string is not palindrome");
    }
}
var test = "madam";
is_palindrome(test);
