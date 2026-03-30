import React, { useState, useEffect } from 'react';

function Clock({ country, offset, onClose }) {
  const [time, setTime] = useState(new Date());

  useEffect(() => {
    const timer = setInterval(() => setTime(new Date()), 1000);
    return () => clearInterval(timer);
  }, []);

  const localTime = new Date(time.getTime() + offset * 3600 * 1000);

  const bgColor = localTime.getHours() < 12 ? 'lavender' : 'lightblue';

  return (
    <div style={{ backgroundColor: bgColor, padding: '10px', margin: '5px' }}>
      <h3>{country}: {localTime.toLocaleTimeString()}</h3>
      <button onClick={onClose}>Close</button>
    </div>
  );
}

export default function App() {
  const [clocks, setClocks] = useState([
    { country: 'India', offset: 0 },
    { country: 'USA', offset: -9.5 },
    { country: 'Japan', offset: 3.5 }
  ]);

  return (
    <div>
      <pre>
        Assignment 14: <br/>
        Enhance the React Clock app: <br/>
        - Update the time using State and Lifecycle methods <br/>
        - Add a close function on each rendered clock component <br/>
        - Assign background color based on AM/PM
        </pre>
      <h1>Enhanced World Clock</h1>
      {clocks.map((c, i) => (
        <Clock
          key={i}
          {...c}
          onClose={() => setClocks(clocks.filter((_, idx) => idx !== i))}
        />
      ))}
    </div>
  );
}