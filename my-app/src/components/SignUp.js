import React, { useRef, useState } from 'react';
import "./signUp.css"
import {Link, useHistory} from "react-router-dom";
import { useAuth } from "../contexts/AuthContext";

export default function Signup(props) {
    const firstNameRef = useRef()
    const lastNameRef = useRef()
    const emailRef = useRef()
    const passwordRef = useRef()
    const passwordConfirmRef = useRef()
    const { signup } = useAuth()
    const [error, setError] = useState('')
    const [emailerror, setemailError] = useState('')
    const [firstNameError, setFirstNameError] = useState('')
    const [lastNameError, setlastNameError] = useState('')

    const [loading, setLoading] = useState(false)
    const history = useHistory()


    async function handleSubmit(e) {
        e.preventDefault()
        if(!firstNameRef.current.value) {
            return  setFirstNameError("First Name field cannot be blank!")
        }
        if (!lastNameRef.current.value) {
            return setlastNameError("Last Name field cannot be blank!");
        }
        if (passwordRef.current.value !== passwordConfirmRef.current.value) {
            return setError('Passwords do not match!')
        }
        const regex = /^[^\s@]+@[^\s@]+\.[^\s@]{2,}$/i;
        if (!emailRef.current.value) {
            return setemailError("Email cannot be blank!");
        } else if (!regex.test(emailRef.current.value)) {
            return setemailError("Invalid email format!");
        }

        try {
            setError('')
            setLoading(true)
            await signup(emailRef.current.value, passwordRef.current.value)
            history.push("/SignIn")
        } catch {
            setError('Failed to create an account')
        }


    }

    return (

        <div className="formContainerSignUp">
            {error && <span className='error'>{error}</span>}
            <form className="sign-up_form" onSubmit={handleSubmit} noValidate>
                <div className="text-container">
                    <h1>Sign Up</h1>
                    <div className="form-input">
                        <input className="input-field" type="text" ref={firstNameRef} placeholder="first name" name="firstName"   required/>
                        {firstNameError && <span className='error'>{firstNameError}</span>}
                    </div>

                    <div className="form-input">
                        <input className="input-field" ref={lastNameRef} type="text" placeholder="last name" name="lastName" required/>
                        {lastNameError && <span className='error'>{lastNameError}</span>}

                    </div>

                    <div className="form-input">
                        <input id="email" className="input-field" ref={emailRef} type="email" placeholder="email address" name="email"  required/>
                        {emailerror && <span className='error'>{emailerror}</span>}

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
