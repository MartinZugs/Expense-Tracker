import SecondNav from "./SecondNav";
import './budget.css';
import Budgetinfo from "./Budgetinfo";
import BudgetChart from "./BudgetChart";


const Budget = () => {


    return (

        <div className='budget-page-wrapper'>
            <SecondNav />
            <div className="row">
                <div className="column1">
                    <Budgetinfo />
                </div>
                <div className="column2">
                    <BudgetChart/>
                </div>
            </div>
        </div>


    )

}

export default Budget;