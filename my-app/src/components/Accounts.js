import React, {useEffect, useState} from "react";
import "./account.css";




const Accounts = () => {

    function MakePosNeg() {
        const TDs = document.querySelectorAll('.plusmin');

        for (let i = 0; i < TDs.length; i++) {
            let temp = TDs[i];
            if (temp.firstChild.nodeValue.indexOf('-') == 0) {
                temp.className = "negative";
            } else {
                temp.className = "positive";
            }

        }

    }

    window.onLoad = MakePosNeg();


        return (


            <div className="accounts-container">
                <h3>Accounts</h3>

                <table className="accounts-table">
                    <tr>

                    </tr>
                    <tr>
                        <th>Checking Account:</th>
                        <td className="plusmin">$5,000.00</td>
                    </tr>
                    <tr>
                        <th>Savings Account:</th>
                        <td className="plusmin">$80,000.00</td>
                    </tr>
                    <tr>
                        <th>Retirement Account:</th>
                        <td className="plusmin">$150,000.00</td>
                    </tr>
                    <tr>
                        <th>Investments:</th>
                        <td className="plusmin">$52,000.00</td>
                    </tr>
                    <tr>
                        <th>Credit Cards:</th>
                        <td className="plusmin">-$14,000.00</td>
                    </tr>
                    <tr>
                        <th>Loans:</th>
                        <td className="plusmin">-$250,000.00</td>
                    </tr>
                </table>

            </div>

        )

}

export default Accounts;