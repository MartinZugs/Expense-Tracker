import SecondNav from "./SecondNav";
import './bills.css';
import Billinfo from "./Billinfo";


const Bills = () => {
    return (

        <div className='bill-page-wrapper'>
            <SecondNav />
            <div className="row">
                <div className="column1">
                    <Billinfo />
                </div>
                <div className="column2">
                    <h1>BillCalendar</h1>
                </div>
            </div>
        </div>

       // <div className="bills-container">
         //   <SecondNav />
           // <div className="content">
             //   <h1>Bills Content</h1>
            //</div>

        //</div>
    )

}

export default Bills;