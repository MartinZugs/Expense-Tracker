import "./logoheader.css";
import {Link} from "react-router-dom";
import logo from "../logo.svg";
function LogoHeader() {
    return(
        <div className="logo-header">
            <Link exact={"true"} to="/"> <div className="logo">
                <img src={logo} alt="Logo" />
                <div className="businessName">Tracker</div>
            </div></Link>
        </div>
    )
}

export default LogoHeader;