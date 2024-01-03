// required to bring the on method from other file
require("./customEmitterTest1")

const customEmitter = require("./CustomEmitterConfig")

customEmitter.emit1("messageLogged")