var Kitten = require('./kitten')

async function createAndSave() {
	try {
		// Way 2
		const kitten2 = await Kitten.create({ name: 'Simba' })

		// Way 3
		// const kitten1 = new Kitten({
		// 	name: 'Simba',
		// 	species: 'Feline',
		// 	age: '2', // make it 'ds' to make the code explode
		// 	address: {
		// 		city: "Baddi",
		// 		street: "Chitkara"
		// 	}
		// })
		await kitten1.save()

		// updating data
		kitten1.name = "Lucy"
		console.log(kitten1.name)
	}
	catch (error) {
		// console.log(error)
		console.log(error.message)
	}
}

createAndSave()