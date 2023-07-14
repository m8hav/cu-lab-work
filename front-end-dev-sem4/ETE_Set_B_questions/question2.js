var counter = 0;

function printNumber() {
    ! (counter++ % 2) && console.log(counter);
    ! (counter % 100) && clearInterval(interval);
}

var interval = setInterval(printNumber, 500);