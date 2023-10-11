for (const num of [1, 2, 3, 4, 5])
  console.log(num);

function Person(name, age) {
  this.name = name;
  this.age = age;
}

// Prototypal Inheritance:
Person.prototype.greet = function () {}

class Employee {
  constructor(name, dept) {
    this.name = name;
    this.dept = dept;
  }
}

// AAYUSH KHOSLA'S CODE:

function sum(a,b){
  const sum = a+b;
  return sum;
}


function alert1(){
  alert("this is the message ");
}


let arr = {firstName:"John", lastName:"Doe", age:50, eyeColor:"blue", person : {firstName:"John", lastName:"Doe", age:50, eyeColor:"blue"}};

//
for(const key in arr){
  console.log(arr[key]);
}

for(const num of [12,2,23,24]){
  console.log(num);
}

//higer order method :-

// map reduce FileSystemEntry.array.forEach(element => {
  
// });


function Person(name,age){
  this.name = name;
  this.age = age;

}
//wrting the function for the Person
Person.prototype.greet = function(){
  console.log("helloooo from the person");
}


// this is the constror function





class Person1{
  constructor(name, dep){
      this.name = name;
      this.dep = dep;
  }
  // this much more easy way to make the functions
  greet(){
      console.log("helooo from Person1 ")
  }

}
console.log(typeof Person1)


console.log(new Person1("aayush " , "CES"))

const p1 = new Person("aayush" , 20);
console.log(p1);

const obj = new Person1("aayush " , "CES");

obj.greet();  // this is the object of the person function
p1.greet();  // this is the object of the person1 class


//function declration   eg :- function Person(name,age){

//function expression eg :- const funfun = function(){}



//arrow function -V ES6
const bar = (a, b =20)=>{

} 
//single parmeerrt
const bar1 = a =>{

} 
// by this it is return a in the body
const bar2 = a => a 



//rest ,spread denoted by ... 

const num =[11,2,3,3,4,5,5,6,67,7];
const [f,s, ...remaining] =num;    // destruching...

console.log(f,s ,remaining)


const {firstName: name1 , lastName : surname ,...rest} = arr;
console.log(name1 , surname , rest);






const anotherperson = {
  name,
  age:surname,
  ...rest
}
console.log(anotherperson)