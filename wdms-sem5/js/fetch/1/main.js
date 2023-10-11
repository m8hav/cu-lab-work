function runSync() {
  console.time('runSync timer');
  let sum = 1;
  for (let i = 1; i < 9999999999; i++, sum *= i);
  console.timeEnd('runSync timer');
  console.log(`Sum is ${sum}`);
}


// ====================
// CALLBACK STUFF
// ====================

let posts;

function fetchAndLogPostsDirectly() {
  fetch("https://jsonplaceholder.typicode.com/posts/1")
    .then(res => res.json())
    .then(data => console.log(data));
}

// function putPostsInVariable() {
//   fetch("https://jsonplaceholder.typicode.com/posts/1")
//   .then(res => res.json())
//   .then(data => posts = data);
// }

// function returnPosts() {
//   // returns promise instead of required data
//   return fetch("https://jsonplaceholder.typicode.com/posts/1")
//   .then(res => res.json())
//   .then(data => data);
// }

// function fetchAndPrintPosts() {
//   // doesn't work - useless

//   // fetchPosts();
//   // while (posts == undefined);
//   // console.log(posts);
//   console.log(returnPosts())
// }

function processData(value) {
  console.log(value);
}

// old way of getting response of apis / async operations
// using callbacks
function _fetchAndLogPostsUsingCallback(callbackFunction) {
  fetch("https://jsonplaceholder.typicode.com/posts/1")
    .then(res => res.json())
    .then(data => callbackFunction(data));
}

function fetchAndLogPostsUsingCallback() {
  _fetchAndLogPostsUsingCallback(processData);
}

// CALLBACK HELL EXAMPLE

// ====================
// PROMISE STUFF
// ====================

function fetchPostsPromisify() {
  return new Promise(function (resolve, reject) {
    fetch("https://jsonplaceholder.typicode.com/posts/1")
      .then(res => res.json())
      .then(data => resolve(data))
      .catch(error => reject(error));
  })
}

function fetchPostsWithPromise() {
  fetchPostsPromisify()
  .then(postData => console.log('Postdata promisify', postData))
  .catch(error => console.error('Error promisify fetch post data', error));
}