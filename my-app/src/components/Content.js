import "./content.css";
import {Link, Route} from "react-router-dom";
import SignUp from "../content/SignUp";
import React from "react";
import SignIn from "../content/SignIn";

function Content() {
    return(
        <div className="content">
            <Route path="/signUp" component={SignUp}/>
            <Route path="/signIn" component={SignIn}/>
        </div>
    )
}

export default Content;