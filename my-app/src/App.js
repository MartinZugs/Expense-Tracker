import React from "react";
import './App.css';
import logo from './logo.svg'
import Button from "./components/Button"

function App() {
  return (
      <div className="container">
        <div className="logo">
          <img src={logo} alt="Logo" />
          <div className="businessName">Tracker</div>
        </div>
        <div className="header">
          <Button
              onClick={() => {console.log("You clicked on me!") }}
              type = "button"
              buttonStyle="btn-primary-outline"
              buttonSize="btn--small"
          >Sign in</Button>
        </div>
        <div className="sidebar">
          <h1>
            Effortlessly handle your finances and stop overspending.
          </h1>
          <h3>
            We make it easy for you to stay on top of your bills and know where your money goes.
          </h3>
            <Button onClick={() => {console.log("You Clicked on Me!") }}
                    type = "button"
                    buttonStyle="btn--primary--solid"
                    buttonSize="btn--large"
            >Sign up</Button>
        </div>
        <div className="content"></div>
        <div className="footer"></div>

      </div>
  );
}

export default App;
