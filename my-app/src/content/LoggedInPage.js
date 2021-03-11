import {HashRouter} from "react-router-dom";
import LogoHeader from "../components/LogoHeader";
import NavHeader from "../components/NavHeader";
import Aside from "../components/Aside";
import Content from "../components/Content";
import Footer from "../components/Footer";
import React, { Component } from 'react';
import SignIn from "./SignIn";
import fire from "../Firebase";

class LoggedInPage extends Component {

    render() {

        return (

            <div ><h1>You have an account!</h1></div>
        );
    }
}
export default LoggedInPage