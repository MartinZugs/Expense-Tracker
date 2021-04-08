import './netWorth.css'
import {useEffect} from "react/cjs/react.production.min";

const NetWorth = () => {

   function MakePosNeg() {
            const TDs = document.querySelectorAll('.plusmin');

            for (let i = 0; i < TDs.length; i++) {
                let temp = TDs[i];
                if (temp.firstChild.nodeValue.indexOf('-') === 0) {
                    temp.className = 'negative';
                } else {
                    temp.className = "positive";
                }

            }

        }
    MakePosNeg();

    return (

        <div className="net-worth-container">
            <h3>Net Worth</h3>
            <table className="net-worth-table">

                <tr>
                    <th>Assets:</th>
                    <td className="plusmin">$5,000.00</td>
                </tr>
                <tr>
                    <th>Debt:</th>
                    <td className="plusmin">$80,000.00</td>
                </tr>
                <tr>
                    <th>Net Worth:</th>
                    <td className="plusmin">$150,000.00</td>
                </tr>
            </table>
        </div>
    )

}


export default NetWorth;