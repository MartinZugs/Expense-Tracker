import "./aside.css";
import Button from "./Button";
import {Link} from "react-router-dom";

function Aside() {
    return (
        <div className="sidebar">
            <h1>
                Effortlessly handle your finances and stop overspending.
            </h1>
            <h3>
                We make it easy for you to stay on top of your bills and know where your money goes.
            </h3>
            <Link to="/signUp"><Button
                type = "button"
                buttonStyle="btn--primary--solid"
                buttonSize="btn--large"
            >Sign up</Button></Link>
        </div>
    )
}
export default Aside;