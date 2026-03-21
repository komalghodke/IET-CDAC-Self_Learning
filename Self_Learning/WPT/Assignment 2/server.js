/*
Q.8) Rebuild any previous Node assignment using Express and a template engine.
*/

const express = require("express");
const app = express();
app.set("view engine", "ejs");

app.get("/", (req, res) => {
  res.render("index", { name: "Komal", msg: "Welcome to EJS template!" });
});

app.listen(3000);