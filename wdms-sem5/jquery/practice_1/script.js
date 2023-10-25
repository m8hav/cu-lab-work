console.log("We are using jQuery");

console.log($);

const firstPTAg = document.querySelector("p");


// logging something when document is ready
$(document).ready(function() {
  console.log("jQuery is WORKINGGG!!!!");
  console.log("We are using")
})

// JS Events Difference:
// DOMContentLoaded - the whole document (HTML) has been loaded.
// load - the whole document and its resources (e.g. images, iframes, scripts) have been loaded.

// $(document).ready()
// near equivalent of DOMContentLoaded
// fires after DOM itself is ready, but before all images are loaded.
// This event prevents any jQuery code from running before the document is finished loading.

// hiding all p tags when any is clicked
// $('p').click(function () {
//   $('p').hide();
// })


// hiding specific p tag when it is clicked
// $('p').click(function () {
//   $(this).hide();
// })


// performing action on already selected element
$(firstPTAg).click(function() {
  console.log("First P Tag was clicked");
})