import React,  { Component } from "react";
import ReactDOM from "react-dom";
import './App.css';
import {
    BrowserRouter as Router, HashRouter,
    Route, Switch
} from "react-router-dom";
import Home from "./components/Home";
import {AuthProvider} from "./contexts/AuthContext";
import Signup from "./content/SignUp";


class App extends Component {


    render() {

        return (
            <Router>
                <AuthProvider>
                    <Switch>
                        <Route exact path="/">
                            <Home/>
                        </Route>
                    </Switch>

                </AuthProvider>

            </Router>
        );
    }
}

export default App;
const rootElement = document.getElementById("root");
ReactDOM.render(<App />, rootElement);