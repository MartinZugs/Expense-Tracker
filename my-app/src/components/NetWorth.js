import './netWorth.css'

const NetWorth = () => {


    return (

        <div className="net-worth-container">
            <h3>Net Worth</h3>
            <table className="net-worth-table">

                <tr>
                    <th>Assets:</th>
                    <td>$5,000.00</td>
                </tr>
                <tr>
                    <th>Debt:</th>
                    <td>$80,000.00</td>
                </tr>
                <tr>
                    <th>Net Worth:</th>
                    <td>$150,000.00</td>
                </tr>
            </table>
        </div>
    )

}


export default NetWorth;