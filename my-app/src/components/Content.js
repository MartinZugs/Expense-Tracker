import "./content.css";
import {Link, Route, Switch} from "react-router-dom";
import SignUp from "./SignUp";
import React, { Component } from "react";
import SignIn from "./SignIn";
import Dashboard from "./Dashboard";
import PrivateRoute from "./PrivateRoute";


class Content extends Component {


    render() {
        return (

            <div className="content">
                <Switch>

                </Switch>
            </div>

        )
    }
}
export default Content;
