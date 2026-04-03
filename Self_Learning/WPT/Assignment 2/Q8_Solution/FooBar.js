/*
Q.4) Write a Node program that prints all the numbers between 1 and 100.
If divisible by 3 → print "foo"
If divisible by 5 → print "bar"
If divisible by both → print "foobar"
*/

for (let i = 1; i <= 100; i++) {
  if (i % 15 === 0) console.log("foobar");
  else if (i % 3 === 0) console.log("foo");
  else if (i % 5 === 0) console.log("bar");
  else console.log(i);
}