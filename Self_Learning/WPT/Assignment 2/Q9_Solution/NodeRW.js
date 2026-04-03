/*
Q.5) Write a program to create a new file and write some content to it 
in synchronous mode and read and display file contents on standard output 
in async mode.
*/

const fs = require("fs");

// sync write
fs.writeFileSync("test.txt", "Hello from Komal, sync write!");

// async read
fs.readFile("test.txt", "utf8", (err, data) => {
  if (err) throw err;
  console.log("File contents:", data);
});