import React, { Component } from 'react';
import {BrowserRouter as Router, HashRouter, Route, Switch} from "react-router-dom";
import LogoHeader from "./LogoHeader";
import NavHeader from "./NavHeader";
import Aside from "./Aside";
import Footer from "./Footer";
import Content from "./Content";
import fire from "../Firebase";
import LoggedInPage from "../content/LoggedInPage";
import {AuthProvider} from "../contexts/AuthContext";


class Home extends Component {



    render() {
        return (


            <HashRouter>
<AuthProvider>

                <div className="container">

                    <LogoHeader />
                    <NavHeader />
                    <Aside />
                    <Content />
                    <Footer />
                </div>
</AuthProvider>
            </HashRouter>

        );
    }
}
export default Home
