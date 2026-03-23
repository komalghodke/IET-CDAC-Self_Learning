/*
Q.8) Rebuild any previous Node assignment using Express and a template engine.
*/
// Rebuilding the simple GET + POST server using Express + Handlebars (HBS).


const express = require("express");
const path = require("path");
const app = express();

app.set("view engine", "hbs");
app.set("views", path.join(__dirname, "views"));

app.use(express.urlencoded({ extended: true }));

app.get("/", (req, res) => {
  res.render("index", { msg: "Hello from GET (Express + HBS)" });
});

app.post("/submit", (req, res) => {
  const name = req.body.name || "Guest";
  res.render("index", { msg: `Hello ${name}, this is POST (Express + HBS)` });
});

app.listen(3000, () => {
  console.log("Server running at http://localhost:3000/");
});
