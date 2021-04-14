import SecondNav from "./SecondNav";
import './budget.css';
import Budgetinfo from "./Budgetinfo";


const Budget = () => {


    return (

        <div className='budget-page-wrapper'>
            <SecondNav />
            <div className="row">
                <div className="column1">
                    <Budgetinfo />
                </div>
                <div className="column2">
                    <h1>Column2</h1>
                </div>
            </div>
        </div>


    )

}

export default Budget;