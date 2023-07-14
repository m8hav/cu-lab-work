"use strict";

const num1_input = document.getElementById("num1");
const num2_input = document.getElementById("num2");

const answer_div = document.getElementById("answer");

function answer(operator){
    let num1 = parseInt(num1_input.value);
    let num2 = parseInt(num2_input.value);

    console.log(num1);
    
    if (operator == '+') answer_div.innerHTML = num1 + num2;
    if (operator == '-') answer_div.innerHTML = num1 - num2;
    if (operator == '*') answer_div.innerHTML = num1 * num2;
    if (operator == '/') answer_div.innerHTML = num1 / num2;
}

// num1_input.onclick = function(event){
//     console.log(event.target.parentNode);
// }