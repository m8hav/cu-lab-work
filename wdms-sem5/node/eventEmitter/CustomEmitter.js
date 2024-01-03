const EventEmitter = require("events")

class CustomEmitter extends EventEmitter {
  log(message) {
    console.log(message)
  }

  on1(eventName) {
    this.on(eventName, function (arg) {
      console.log("Listener called", arg)
    })
  }

  emit1(eventName) {
    this.emit(eventName, { id: 1, url: "http://" })
  }
}

module.exports = CustomEmitter