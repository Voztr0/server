const express = require('express');
const morgan = require('morgan');
const app = express();

app.set('view engine', 'ejs');

app.use(express.urlencoded({ extended: false }));
app.get('/', (req, res) => {
  res.render('index');
});
const port = 3000;

app.listen(port, () => console.log('Servidor ejecutandose en puerto', port));
