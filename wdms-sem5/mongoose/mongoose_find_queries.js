var Kitten = require('./kitten')

async function search() {
	try {
		// const searchResults = await Kitten.find({name: "Luci"}).sort({address: -1}).limit(1)
		// const searchResults = await Kitten.findOne({name: "Simba"})
		// const searchResults = await Kitten.findOne({name: "Simba", address: {$exists: true}})
		const searchResults = await Kitten.findById("659da33a3640990cbbddff24")
											.populate("bestFriend")

		// const searchResults = await Kitten.where("name").equals("Simba")
		// const searchResults = await Kitten.where("age").gt(1).lt(20)
											// .where({name: "Simba"}) // both way work
											// .where("name").equals("Simba")
		// 									.populate("bestFriend")
											// .sort({age: -1}).limit(1)
											// .select(["age", "address"]) // shows only these particular property
		
		// const searchResults = await Kitten.findByName("Simba")
		// const searchResults = await Kitten.find().byName("Simba")
		// console.log(typeof(searchResults[0].age), searchResults) // name: 'Simba', _id: '659dac8013b2c81ce2e3c65e'

		// const searchKitten = await Kitten.findOne({name: "Simba", age: {$exists: true}, species: {$exists: true}})
		// console.log(searchKitten.ageAndSpecies)
		console.log(searchResults) 
		// await searchKitten.save()
		// console.log(searchKitten)

		// naughtyKitten = searchResults[0]
		// naughtyKitten.bestFriend = "659dac8013b2c81ce2e3c65e" // 659da33a3640990cbbddff24
		// console.log(naughtyKitten)
		// await naughtyKitten.save()
	}
	catch (error) {
		console.log(error.message)
	}
}
search()