import "./navheader.css";
import {useAuth} from "../contexts/AuthContext";
import SignInButton from "./SignInButton";
import SignOutButton from "./SignOutButton";


const NavHeader = () => {

    const { currentUser } = useAuth()

    return (
        <div className="header-navbar">
            {currentUser? <SignOutButton /> : <SignInButton />}

        </div>
    )
};

export default NavHeader;