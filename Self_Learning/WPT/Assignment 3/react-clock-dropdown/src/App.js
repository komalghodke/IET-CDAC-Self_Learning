import React, { useState, useEffect } from 'react';

function Clock({ country, offset }) {
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
    </div>
  );
}

export default function App() {
  const [clocks, setClocks] = useState([]);
  const [selected, setSelected] = useState('India');

  const zones = {
    India: 0,
    USA: -9.5,
    Japan: 3.5,
    UK: -5.5
  };

  const addClock = () => {
    setClocks([...clocks, { country: selected, offset: zones[selected] }]);
  };

  return (
    <div>
      <pre>
      Assignment 15: <br/>
      Add a feature in the React Clock app where one can select a country time zone  <br/>
      from dropdown list and click "Add" to render it.
      </pre>
      <h1>World Clock with Dropdown</h1>
      <select onChange={e => setSelected(e.target.value)}>
        {Object.keys(zones).map(c => <option key={c}>{c}</option>)}
      </select>
      <button onClick={addClock}>Add</button>

      {clocks.map((c, i) => (
        <Clock key={i} {...c} />
      ))}
    </div>
  );
}