var people = [
    {
        name: "Sandeep",
        age: "41"
    },
    {
        name: "Ameer",
        age: "29"
    },
]

people.forEach((data, index, array) => {
    document.write("<br>");
    document.write(data.name);
})