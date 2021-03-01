import React, { Component } from 'react';
import logo from "../logo.svg";
import Button from "./Button";
import {HashRouter, Route} from "react-router-dom";
import { Link } from "react-router-dom";
import SignUp from "../content/SignUp";
class Home extends Component {
    render() {
        return (
            <HashRouter>
               <div className="container">
                   <Link exact to="/"> <div className="logo">
                        <img src={logo} alt="Logo" />
                        <div className="businessName">Tracker</div>
                   </div></Link>
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
                        <Link to="/signUp"><Button
                            type = "button"
                            buttonStyle="btn--primary--solid"
                            buttonSize="btn--large"
                        >Sign up</Button></Link>
                    </div>
                    <div className="content">

                        <Route path="/signUp" component={SignUp}/>
                    </div>
                    <div className="footer"></div>
                </div>
            </HashRouter>
        );
    }
}
export default Home