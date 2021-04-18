import SecondNav from "./SecondNav";
import Accounts from "./Accounts";
import NetWorth from "./NetWorth";
import AssetsChart from "./AssetsChart";
import './dashboard.css'


const Dashboard = () => {

    return (

        <div className="dashboard-container">
          <SecondNav />
          <div className="content">
              <div className="sidebar">
                  <Accounts />
              </div>

              <div className="themain">
                  <NetWorth />
                  <AssetsChart />
              </div>
          </div>
        </div>
    )

}


export default Dashboard;