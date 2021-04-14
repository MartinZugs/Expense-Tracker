import SecondNav from "./SecondNav";
import './budget.css';


const Budget = () => {


    return (

        <div className='budget-page-wrapper'>
            <SecondNav />
            <div className="row">
                <div className="column">
                    <h1>Column1</h1>
                </div>
                <div className="column">
                    <h1>Column2</h1>
                </div>
            </div>
        </div>


    )

}

export default Budget;