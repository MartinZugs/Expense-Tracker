import React, {useState} from "react";
import "./account.css"

const Accounts = () => {

    return (

        <div className="accounts-container">
           <h3>Accounts</h3>

            <table className="accounts-table">
                <tr>

                </tr>
                <tr>
                    <th>Checking Account:</th>
                    <td>$5,000.00</td>
                </tr>
                <tr>
                    <th>Savings Account:</th>
                    <td>$80,000.00</td>
                </tr>
                <tr>
                    <th>Retirement Account:</th>
                    <td>$150,000.00</td>
                </tr>
                <tr>
                    <th>Investments:</th>
                    <td>$52,000.00</td>
                </tr>
                <tr>
                    <th>Credit Cards:</th>
                    <td>$14,000.00</td>
                </tr>
                <tr>
                    <th>Loans:</th>
                    <td>$250,000.00</td>
                </tr>
            </table>

        </div>
    )

}

export default Accounts;