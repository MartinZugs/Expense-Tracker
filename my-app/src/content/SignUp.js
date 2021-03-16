import React, { useRef, useState } from 'react';
import "./signUp.css"
import {Link} from "react-router-dom";
import { useAuth } from "../contexts/AuthContext";

export default function Signup(props) {

    const emailRef = useRef()
    const passwordRef = useRef()
    const passwordConfirmRef = useRef()
    const { signup } = useAuth()
    const [error, setError] = useState('')
    const [loading, setLoading] = useState(false)

    async function handleSubmit(e) {
        e.preventDefault()

    if (passwordRef.current.value !== passwordConfirmRef.current.value) {
        return setError('Passwords do not match')
    }

    try {
        setError('')
        setLoading(true)
        await signup(emailRef.current.value, passwordRef.current.value)
    } catch {
        setError('Failed to create an account')
    }
    setLoading(false)
}

return (

    <div className="formContainer">
        {error && <span className='error'>{error}</span>}
        <form className="sign-up_form" onSubmit={handleSubmit} noValidate>
            <div className="text-container">
                <div className="form-input">
                    <input className="input-field" type="text" placeholder="first name" name="firstName"  required/>

                </div>

                <div className="form-input">
                    <input className="input-field" type="text" placeholder="last name" name="lastName" required/>

                </div>

                <div className="form-input">
                    <input id="email" className="input-field" ref={emailRef} type="email" placeholder="email address" name="email"  required/>

                </div>

                <div className="form-input">

                    <input id="password" className="input-field" ref={passwordRef} type="password" placeholder="password" name="password"  required/>

                </div>
                <div className="form-input">
                    <input className="input-field" type="password"  ref={passwordConfirmRef} placeholder="confirm password" name="password2" required/>

                </div>

                <button disabled={loading} type="submit" className="btn--primary--form btn--small" >Create Account</button>
                <p className="message">Already registered? <Link to="/SignIn">Sign In</Link></p>

            </div>
        </form>

    </div>
)

}
