import React, { Component } from 'react';
import "./signIn.css"
import fire from "../Firebase";





class SignIn extends Component {


    constructor(props) {
        super(props);
        this.signin = this.signin.bind(this);
        this.onChange = this.onChange.bind(this);
        this.state = {
            email: '',
            password: '',

        };
    }

    onChange = event => {
        this.setState({ [event.target.name]: event.target.value });
    };



    signin(e){
        const email=this.state.email
        const password=this.state.password
        e.preventDefault();
        fire.auth().signInWithEmailAndPassword(email, password).then((u)=>{
            console.log(u)
        }).catch((err)=>{
            console.log(err);
        })
    }



    render() {

        return (

            <div className="formContainer">

                <form className="sign-up_form" onSubmit={this.handleSubmit} noValidate>
                    <div className="text-container">

                        <div className="form-input">
                            <input id="email" value={this.state.email} className="input-field"  type="email" placeholder="email address" name="email" onChange={this.onChange} required/>

                        </div>

                        <div className="form-input">

                            <input id="password"  value={this.state.password} className="input-field" type="password" placeholder="password" name="password" onChange={this.onChange} required/>

                        </div>

                        <button  onClick={this.signin} className="btn--primary--form btn--small" type="submit">Login!</button>

                    </div>
                </form>

            </div>
        )
    }
}
export default SignIn