/*
<pre>
Assignment 10:
Write a program to create a new file and write some content to it in synchronous mode 
and read and display file contents on standard output in async mode.
</pre>
*/

const fs = require('fs');

fs.writeFileSync('demo.txt', 'Hello Komal, this is synchronous write!\n');

fs.readFile('demo.txt', 'utf8', (err, data) => {
  if (err) throw err;
  console.log("File contents (async read):");
  console.log(data);
});
