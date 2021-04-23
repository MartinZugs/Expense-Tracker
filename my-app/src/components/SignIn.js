import React, { useRef, useState, useEffect } from 'react';
import "./signIn.css"
import {Link, useHistory} from "react-router-dom";
import { useAuth } from "../contexts/AuthContext";


export default function SignIn() {

    const emailRef = useRef()
    const passwordRef = useRef()
    const { signin } = useAuth()
    const [error, setError] = useState('')
    const [, setLoading] = useState(false)
    const history = useHistory()

    useEffect(() => {
    }, []);


    const handleSubmit = async (e) => {
        e.preventDefault()

      try {
            setError('')
            setLoading(true)
            await signin(emailRef.current.value, passwordRef.current.value)
            history.push("/dashboard")
        } catch {
            setError('Failed to sign in')
        }
        setLoading(false)

    }



        return (

            <div className="formContainerSignIn">
                <form className="sign-up_form" onSubmit={handleSubmit} noValidate>
                    {error && <span className='error'>{error}</span>}

                    <div className="text-container">
                        <h1>Sign In</h1>
                        <div className="form-input">
                            <input id="email" className="input-field" ref={emailRef} type="email" placeholder="email address" name="email" required/>

                        </div>

                        <div className="form-input">

                            <input id="password"  className="input-field" ref={passwordRef} type="password" placeholder="password" name="password" required/>

                        </div>

                        <button  className="btn--primary--form btn--small" type="submit">Login!</button>
                        <p className="message">Need an Account? <Link to="/SignUp">Sign Up</Link></p>
                    </div>

                </form>
            </div>
        )
}
