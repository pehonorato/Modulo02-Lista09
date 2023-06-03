const express = require('express');
const mongoose = require('mongoose');

const app = express();
const port = 3000;

mongoose.connect('mongodb://localhost:????/DevsBar', {
  useNewUrlParser: true,
  useUnifiedTopology: true,
});

const Bebida = mongoose.model('Bebida', {
  nome: String,
  descricao: String,
  fabricante: String,
  emEstoque: Boolean,
  publicadoEm: Date,
});

const Lanche = mongoose.model('Lanche', {
  nome: String,
  descricao: String,
  vegano: Boolean,
  emEstoque: Boolean,
  publicadoEm: Date,
});

app.use(express.json());

app.post('/cadastrar-bebida', async (req, res) => {
  try {
    await new Bebida(req.body).save();
    res.sendStatus(201);
  } catch {
    res.sendStatus(500);
  }
});

app.get('/listar-bebidas', async (req, res) => {
  try {
    res.json(await Bebida.find());
  } catch {
    res.sendStatus(500);
  }
});

app.post('/cadastrar-lanche', async (req, res) => {
  try {
    await new Lanche(req.body).save();
    res.sendStatus(201);
  } catch {
    res.sendStatus(500);
  }
});

app.get('/listar-lanches', async (req, res) => {
  try {
    res.json(await Lanche.find());
  } catch {
    res.sendStatus(500);
  }
});

app.listen(port, () => console.log(`Servidor rodando em http://localhost:${port}`));
//Novamente não consiguo abrir os aplicativos necessários, e preciso saber como fazelos voltar ao normal, e acredito que seja problema do meu PC...