import React, { Component } from 'react';
import {BrowserRouter as Router, HashRouter, Route} from "react-router-dom";
import SignUp from "../content/SignUp";
import LogoHeader from "./LogoHeader";
import NavHeader from "./NavHeader";
import Aside from "./Aside";
import Footer from "./Footer";
import Content from "./Content";
import fire from "../Firebase";
import LoggedInPage from "../content/LoggedInPage";
import SignIn from "../content/SignIn";
import App from "../App";

class Home extends Component {
    constructor(props) {
        super(props);
        this.state = {
            user: {}
        }
    }
logout(){
        fire.auth().signOut();
}

    componentDidMount() {
        this.authListener();
    }
    componentWillUnmount() {
        // fix Warning: Can't perform a React state update on an unmounted component
        this.setState = (state, callback) => {
            return;
        };
    }

    authListener() {
        fire.auth().onAuthStateChanged((user) => {
            if (user) {
                this.setState({user})
            } else {
                this.setState({user: null})
            }
        })

    }


    render() {
        return (


        <HashRouter>
            <div>
                {this.state.user ? (<LoggedInPage/>) : (<h1 style={{color: "red"}}>You are not signed in!</h1>)}

            </div>
            <button onClick={this.logout}>Sign out</button>
            <div className="container">

                <LogoHeader />

                <NavHeader />

                    <Aside />
                   <Content />


                   <Footer />
                </div>

            </HashRouter>

        );
    }
}
export default Home

