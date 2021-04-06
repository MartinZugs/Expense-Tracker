import React, {useState} from "react";
import {useAuth} from "../contexts/AuthContext";
import {useHistory} from "react-router-dom";
import "./account.css"

const Account = () => {
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
           Account component
            <div><h1>You are signed in!</h1>
                {error && <span>{error}</span>}

                <button onClick={handleLogout} className="btn--primary--form btn--small">Sign out</button>
            </div>
        </div>
    )

}


export default Account;