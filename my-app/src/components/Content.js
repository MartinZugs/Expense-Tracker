import "./content.css";
import {Link, Route} from "react-router-dom";
import SignUp from "../content/SignUp";
import React, { Component } from "react";
import SignIn from "../content/SignIn";
import LoggedInPage from "../content/LoggedInPage";
import fire from "../Firebase";

class Content extends Component {


    render() {
        return (

            <div className="content">
                <Route path="/signUp" component={SignUp}/>
                <Route path="/signIn" component={SignIn}/>
                <Route path="/LoggedInPage" component={LoggedInPage}/>
            </div>

        )
    }
}
export default Content;