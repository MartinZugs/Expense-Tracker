import React, { useState } from "react"
import fire from "../Firebase";
import {HashRouter, useHistory} from "react-router-dom";
import {AuthProvider, useAuth} from "../contexts/AuthContext";
import "./SignIn"
import PrivateRoute from "../components/PrivateRoute";


export default function LoggedInPage() {
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


        <HashRouter>
            <div>


            </div>
                <div><h1>You are signed in!</h1>
                    {error && <span>{error}</span>}

                <button onClick={handleLogout}>Sign out</button>

            </div>
        </HashRouter>

    )
}
