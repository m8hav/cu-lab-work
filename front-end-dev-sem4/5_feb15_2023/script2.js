"use strict";

const original_text_input = document.getElementById("original-text");

original_text_input.onkeyup = function(event){
    // original_text_input.value = original_text_input.value.toUpperCase();
    // OR
    event.target.value = event.target.value.toUpperCase();
}