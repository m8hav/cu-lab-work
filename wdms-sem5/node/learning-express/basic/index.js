const express = require('express');

const app = express();
const port = 3000;

app.get('/', (req, res) => {
  // res.send('Hello World!');
  // res.sendFile('./public/index.html');      // relative path not allowed
  res.sendFile(__dirname + '/public/index.html');
  // absolute path required
});

app.listen(port, () => {
  console.log(`Server listening on port ${port}`);
});