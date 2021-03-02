import React, { Component } from 'react';
import "./signUp.css"
class SignUp extends Component {
    render() {
        return (

            <div className="formContainer">

             <div className="sign-up_form">
                 <div className="text-container">
                     <input type="text" placeholder="first name"/>
                     <input type="text" placeholder="last name"/>
                     <input type="text" placeholder="email address"/>
                     <input type="password" placeholder="password"/>
                     <input type="password" placeholder="verify password"/>

                     <button>Create Account</button>
                     <p className="message">Already registered? <a href="#">Sign In</a></p>

                 </div>
             </div>

            </div>
        )
    }
}
export default SignUp