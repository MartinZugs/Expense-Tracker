import "./content.css";
import {Link, Route} from "react-router-dom";
import SignUp from "../content/SignUp";
import React from "react";
import Login from "../content/Login"

function Content() {
    return(
        <div className="content">
            <Route path="/signUp" component={SignUp}/>
            <Route path="/Login" component={Login}/>
        </div>
    )
}

export default Content;