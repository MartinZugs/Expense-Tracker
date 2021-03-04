import React, { Component } from 'react';
import {HashRouter, Route} from "react-router-dom";
import SignUp from "../content/SignUp";
import LogoHeader from "./LogoHeader";
import NavHeader from "./NavHeader";
import Aside from "./Aside";
import Footer from "./Footer";
import Content from "./Content";

class Home extends Component {
    render() {
        return (
            <HashRouter>
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