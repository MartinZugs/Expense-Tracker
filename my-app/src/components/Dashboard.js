import SecondNav from "./SecondNav";
import Account from "./Account";
import NetWorth from "./NetWorth";
import TotalSpending from "./TotalSpending";
import './dashboard.css'


const Dashboard = () => {


    return (

        <div className="container">
          <SecondNav />
          <div className="content">
              <div className="sidebar">
                  <Account />
              </div>

              <div className="themain">
                  <NetWorth />
                  <TotalSpending />
              </div>

          </div>
        </div>
    )

}


export default Dashboard;