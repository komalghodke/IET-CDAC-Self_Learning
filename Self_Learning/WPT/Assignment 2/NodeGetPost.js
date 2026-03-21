/*
Q.6) Build a simple Node.js web application serving both HTTP GET and POST methods.
*/

const http = require("http");

http.createServer((req, res) => {
  if (req.method === "GET") res.end("Hello from GET");
  else if (req.method === "POST") res.end("Hello from POST");
}).listen(3000);