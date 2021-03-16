import "./content.css";
import {Link, Route, Switch} from "react-router-dom";
import SignUp from "../content/SignUp";
import React, { Component } from "react";
import SignIn from "../content/SignIn";
import LoggedInPage from "../content/LoggedInPage";
import PrivateRoute from "./PrivateRoute";


class Content extends Component {


    render() {
        return (

            <div className="content">
                <Switch>
                <Route path="/signUp" component={SignUp}/>
                <Route path="/signIn" component={SignIn}/>
                <PrivateRoute path="/LoggedInPage" component={LoggedInPage}/>
                </Switch>
            </div>

        )
    }
}
export default Content;
