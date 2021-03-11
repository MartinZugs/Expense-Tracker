import React,  { Component } from "react";
import ReactDOM from "react-dom";
import './App.css';
import {
    BrowserRouter as Router, HashRouter,
    Route,
} from "react-router-dom";
import Home from "./components/Home";
import fire from "./Firebase";
import LoggedInPage from "./content/LoggedInPage";
import SignIn from "./content/SignIn";


class App extends Component {


    render() {

        return (

            <Router>
                <Route exact path="/">
                    <Home/>

                </Route>

            </Router>
        );
    }
}


export default App;
const rootElement = document.getElementById("root");
ReactDOM.render(<App />, rootElement);