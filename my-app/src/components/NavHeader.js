import "./navheader.css";
import Button from "./Button";

function NavHeader() {
    return (
        <div className="header-navbar">
            <Button
                onClick={() => {console.log("You clicked on me!") }}
                type = "button"
                buttonStyle="btn-primary-outline"
                buttonSize="btn--small"
            >Sign in</Button>
        </div>
    )
}
export default NavHeader;