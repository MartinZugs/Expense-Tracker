import React,  { Component } from "react";
import ReactDOM from "react-dom";
import './App.css';
import {
    BrowserRouter as Router,
    Route, Switch
} from "react-router-dom";
import Home from "./components/Home";
import {AuthProvider} from "./contexts/AuthContext";
import PrivateRoute from "./components/PrivateRoute";
import LogoHeader from "./components/LogoHeader";
import NavHeader from "./components/NavHeader";
import Footer from "./components/Footer";
import SignUp from "./components/SignUp";
import SignIn from "./components/SignIn";
import Dashboard from "./components/Dashboard";

class App extends Component {


    render() {

        return (
            <Router>
                <AuthProvider>
                    <div className="body">
                    <div className="navContainer">
                        <LogoHeader />
                        <NavHeader />

                    </div>
                    <div className="main">
                    <Switch>

                        <Route exact path="/" component={Home} />
                        <Route path="/signUp" component={SignUp}/>
                        <Route path="/dashboard2" component={Dashboard}/>
                        <Route path="/signIn" component={SignIn}/>
                        <PrivateRoute path="/dashboard" component={Dashboard}/>
                    </Switch>
                    </div>
                    <Footer />
                    </div>
                </AuthProvider>

            </Router>
        );
    }
}

export default App;
const rootElement = document.getElementById("root");
ReactDOM.render(<App />, rootElement);