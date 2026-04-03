/*
Q.7) Use Node and Express to write a simple web application 
that consists of at least 5 route implementations.
*/

const express = require("express");
const app = express();

app.get("/", (req, res) => res.send("Home"));
app.get("/about", (req, res) => res.send("About"));
app.get("/contact", (req, res) => res.send("Contact"));
app.post("/submit", (req, res) => res.send("Form submitted"));
app.get("/products", (req, res) => res.send("Products list"));

app.listen(3000);