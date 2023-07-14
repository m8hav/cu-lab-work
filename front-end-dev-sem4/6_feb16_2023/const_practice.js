// CONST ARRAY
// change in array values and appending in array is allowed

const arr = [1, 2, 3, 4, 5];
document.write(arr, "<br>");
console.log(arr)

arr[0] = 76;
document.write(arr, "<br>");
console.log(arr)

arr.push(100);
document.write(arr, "<br>");
console.log(arr)


console.log(check_var_hoisting);
console.log(check_let_hoisting);
console.log(check_const_hoisting);
var check_var_hoisting = "checking var hoisting";
let check_let_hoisting = "checking let hoisting";
const check_const_hoisting = "checking const hoisting";