import { Schema, model } from 'mongoose';

const KittySchema = new Schema({
  name: String,
  species: String,
  age: {
    type: Number,
    min: 1,
    max: 30,
    validate: {
      validator: age => age % 2 === 0,
      message: `${this.age} is not an even number!`
    }
  },
  
})