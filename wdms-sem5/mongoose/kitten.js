const mongoose = require('mongoose')

db_url = "mongodb://localhost:27017/Chitkara" // append DB name at end of URL
mongoose.connect(db_url)
const connection = mongoose.connection;

connection.once('open', () => {
	console.log("Connected with DB");
})
connection.on('error', () => {
	console.log("Couldn't connect to MongoDB.")
})
const addressSchema = new mongoose.Schema({
	city: String,
	street: String
})

const kittySchema = new mongoose.Schema({
	name: String,
	species: String,
	age: {
		type: Number,
		min: 1,
		max: 30,
		validate: {
			validator: value => value%2===0,
			message: props => `${props.value} is not even`
		}
	},
	address:
	// addressSchema, // Way 2: nesting one schema inside another

	{ // Way 1: Define explicitly (not reusable though)
		city: String,
		street: String
	},
	createdAt: {
		type: Date,
		immutable: true,
		default: () => Date.now()
		// new Date() // static method of defining date
	},
	updatedAt: {
		type: Date,
		default: () => Date.now()
	},
	bestFriend: {
		type: mongoose.SchemaTypes.ObjectId,
		ref: "Kitten"
	}
});

kittySchema.methods.speak = function speak() {
	console.log('Meow Meow, I am', this.name);
};

kittySchema.statics.findByName = function(name) {
	// return this.where({name: new RegExp(name)})
	return this.find({name: new RegExp(name)})
}

kittySchema.query.byName = function(name) {
	return this.find({name: new RegExp(name)}).limit(1)
}

kittySchema.virtual('ageAndSpecies').get(function() {
	// console.log(this.name, this.email) // Another Way without returning
	return `${this.age} ${this.species}` 
})

kittySchema.pre('save', function(next) { // shouldn't be an arrow method
	this.updatedAt = Date.now()
	next()
})

kittySchema.post('save', function(doc, next) { // shouldn't be an arrow method
	doc.speak()
	next()
})

const Kitten = mongoose.model('Kitten', kittySchema);

//a good practice is that models are exported so that they can be used in other files
module.exports = Kitten