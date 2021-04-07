import React from 'react';
import './secondnav.css'
import {Link} from "react-router-dom";

 const SecondNav = () => {


    return (

        <nav>
            <ul>
                <li><Link to="/dashboard">dashboard</Link></li>
                <li><Link to="/budget">budget</Link></li>
                <li><Link to="/bills">bills</Link></li>
                <li><Link to="/advice">advice</Link></li>
            </ul>
        </nav>
    )

}


export default SecondNav;