import React from 'react';
import logo from './logo.svg';
import './App.css';
import {Component, useState, useEffect} from 'react';

function App() {
  const [message, setMessage] = useState("");

  useEffect(() => {
      fetch('/crypto/coins')
          .then(response => response.text())
          .then(message => {
              setMessage(message);
          });
  },[])

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <h1 className="App-title">{message}</h1>
      </header>
    </div>
  );
}

export default App;
