import {Link, useHistory} from "react-router-dom";
import Button from "./Button";
import {useAuth} from "../contexts/AuthContext";
import React, {useState} from "react";

const SignOutButton = () => {

    const [error, setError] = useState("")
    const { currentUser, logout } = useAuth()
    const history = useHistory()
    async function handleLogout(){
        setError('')

        try {

            await logout()
            history.push('/SignIn')
        } catch {
            setError('Failed to log out!')
        }
    }
    return (
        <div>
            {error && <span>{error}</span>}
        <Link to ="/"><Button  onClick={handleLogout}
            type = "button"
            buttonStyle="btn-primary-outline"
            buttonSize="btn--small"
        >Sign out</Button></Link>
        </div>
    )
}

export default SignOutButton;