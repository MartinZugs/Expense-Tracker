
import "./account.css";
import {Component} from "react";





class Accounts extends Component {

    componentDidMount() {


        function MakePosNeg() {

        }

        MakePosNeg()
        {
            const TDs = document.querySelectorAll('.accounts-column-plusmin');

            for (let i = 0; i < TDs.length; i++) {
                let temp = TDs[i];
                if (temp.firstChild.nodeValue.indexOf('-') == 0) {
                    temp.className = "negative";
                } else {
                    temp.className = "positive";
                }

            }

        }
    }



        render (){
            return (


        <div className="accounts-container">

            <h3>Accounts</h3>
            <div className="accounts-row">
                <div className="accounts-column">Checking Account</div>
                <div className="accounts-column-plusmin">$5,000.00</div>
            </div>
            <div className="accounts-row">
                <div className="accounts-column">Savings Account</div>
                <div className="accounts-column-plusmin">$80,000.00</div>
            </div>
            <div className="accounts-row">
                <div className="accounts-column">Retirement</div>
                <div className="accounts-column-plusmin">$150,000.00</div>
            </div>
            <div className="accounts-row">
                <div className="accounts-column">Investments</div>
                <div className="accounts-column-plusmin">$52,000.00</div>
            </div>
            <div className="accounts-row">
                <div className="accounts-column">Credit Cards</div>
                <div className="accounts-column-plusmin">-$14,000.00</div>
            </div>
            <div className="accounts-row">
                <div className="accounts-column">Loans</div>
                <div className="accounts-column-plusmin">-$250,000.00</div>
            </div>
        </div>

    )

}}

export default Accounts;