import SecondNav from "./SecondNav";
import './bills.css';
import Billinfo from "./Billinfo";
import BillsDue from "./BillsDue";


const Bills = () => {
    return (

        <div className='bill-page-wrapper'>
            <SecondNav />
            <div className="row">
                <div className="column1">
                    <Billinfo />
                </div>
                <div className="column2">
                    <BillsDue/>
                </div>
            </div>
        </div>

    )

}

export default Bills;