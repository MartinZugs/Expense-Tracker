import React, { Component } from 'react';
import Hero from "./Hero";
import './home.css'
import HomeLeftImage from "./HomeLeftImage";


class Home extends Component {



    render() {
        return (

                <div className="container">
                    <Hero />
                    <HomeLeftImage />
                </div>


        );
    }
}
export default Home
