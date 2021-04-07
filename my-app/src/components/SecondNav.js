import React from 'react';
import './secondnav.css'
import {NavLink} from "react-router-dom";

 const SecondNav = () => {


    return (

        <nav>
            <ul>
                <li><NavLink to="/dashboard" activeClassName="active">dashboard</NavLink></li>
                <li><NavLink to="/budget" activeClassName="active">budget</NavLink></li>
                <li><NavLink to="/bills" activeClassName="active">bills</NavLink></li>
                <li><NavLink to="/advice" activeClassName="active">advice</NavLink></li>
            </ul>
        </nav>
    )

}


export default SecondNav;