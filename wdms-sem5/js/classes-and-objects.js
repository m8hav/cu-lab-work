class Stu1 {
  constructor(name) {
    this.name = name;
  }
    outputName(){
        console.log(this.name)
    }
}
class Stu2 {
  constructor(name) {
    this.name = name;
  }
    outputName = function() {
        console.log(this.name)
    }
}
class Stu3 {
  constructor(name) {
    this.name = name;
  }
    outputName = () => {
        console.log(this.name)
    }
}

const stu1 = {
  name: "stu1",
  study() {
    console.log(this.name);
  }
}
const stu2 = {
  name: "stu2",
  study: function() {
    console.log(this.name);
  }
}
// can't do this below
// const stu3 = {
//   name: "stu3",
//   study = function() {
//     console.log(this.name);
//   }
// }


var a = new Stu1("bruh1");
a.outputName();
var b = new Stu2("bruh2");
b.outputName();
var c = new Stu3("bruh3");
c.outputName();

stu1.study();
stu2.study();
// stu3.study();

function Student0(name, age, id, comment) {
  this.name = name;
  this.age = age;
  this.id = id;
  this.comment = comment;
  this.details = function () {
    return name + ", " + age + ", " + id + ", " + comment;
  }
  console.log(comment);
}
// can't create constructor this way
// function Student1(name, age, id, comment) {
//   constructor(name, age, id, comment) {
//     this.name = name;
//     this.age = age;
//     this.id = id;
//     this.comment = comment;
//   }
//   this.details = function () {
//     return name + ", " + age + ", " + id + ", " + comment;
//   }
//   console.log(comment);
// }
class Student2 {
  constructor(name, age, id, comment) {
    this.name = name;
    this.age = age;
    this.id = id;
    this.comment = comment;
  }
  details() {
    return this.name + ", " + this.age + ", " + this.id + ", " + this.comment;
  }
}

var Madhav = new Student("Madhav", 21, 2011981262, "I wanna sleep man...");
console.log(Madhav.details());

var Aayush = new Student2("Aayush", "anshika pyari", 2111981297, "mai akela hu");
console.log(Aayush.details());

