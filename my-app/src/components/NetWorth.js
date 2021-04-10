import './netWorth.css'
import {useEffect} from "react/cjs/react.production.min";

const NetWorth = () => {

    function MakePosNeg() {
        const TDs = document.querySelectorAll('.net-worth-column-plusmin');

        for (let i = 0; i < TDs.length; i++) {
            let temp = TDs[i];
            if (temp.firstChild.nodeValue.indexOf("-") == 0) {
                temp.className = "negative";
            } else {
                temp.className = "positive";
            }

        }
    }
   NetWorth.onLoad = MakePosNeg();

    return (

        <div  className="net-worth-container">
            <h3>Net Worth</h3>
            <div className="net-worth-row">
                <div className="net-worth-column">Assets</div>
                <div className="net-worth-column-plusmin">$287,000.00</div>
            </div>
            <div className="net-worth-row">
                <div className="net-worth-column">Debt</div>
                <div className="net-worth-column-plusmin">-$264,000.00</div>
            </div>
            <div className="net-worth-row">
                <div className="net-worth-column">Net Worth</div>
                <div className="net-worth-column-plusmin">$23,000.00</div>
            </div>
        </div>

    )

}


export default NetWorth;