import React, { useState, useEffect } from 'react';

function Clock({ country, offset }) {
  const [time, setTime] = useState(new Date());

  useEffect(() => {
    const timer = setInterval(() => setTime(new Date()), 1000);
    return () => clearInterval(timer);
  }, []);

  const localTime = new Date(time.getTime() + offset * 3600 * 1000);

  return (
    <h3>{country}: {localTime.toLocaleTimeString()}</h3>
  );
}

export default function App() {
  return (
    <div>
      <pre>
      Assignment 13:
      Build a React Clock app showing time (hh:mm:ss) of any three countries.
      </pre>
      <center>
      <h1>World Clock</h1>
      <Clock country="India" offset={0} />
      <Clock country="USA" offset={-9.5} />
      <Clock country="Japan" offset={3.5} />
      </center>
    </div>
  );
}