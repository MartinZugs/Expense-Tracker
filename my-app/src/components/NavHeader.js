import "./navheader.css";
import Button from "./Button";
import {Link} from "react-router-dom";
import {useHistory} from "react-router-dom";

function NavHeader() {

    return (
        <div className="header-navbar">
            <Link to ="/signIn"><Button
                type = "button"
                buttonStyle="btn-primary-outline"
                buttonSize="btn--small"
            >Sign in</Button></Link>
        </div>
    )
}
export default NavHeader;