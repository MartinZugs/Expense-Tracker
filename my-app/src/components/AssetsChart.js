
import "./assetsChart.css"

import Chart from "react-google-charts";


const AssetsChart = () =>  {


        return (
            <div className="total-spending-container">
            <h3>Assets Chart</h3>
                <Chart
                    width={'500px'}
                    height={'300px'}
                    chartType="PieChart"
                    loader={<div>Loading Chart</div>}
                    data={[
                        ['Assets', 'Percentage'],
                        ['Checking', 200],
                        ['Savings', 300],
                        ['Investment', 500],
                        ['Retirement', 1000],
                    ]}
                    options={{
                        legend: 'true',
                        pieSliceText: 'label',
                        pieStartAngle: 100,
                        colors: ['#7CFC00', '#568203', '#006400', '#4D5D53']

                    }}
                    rootProps={{ 'data-testid': '4' }}/>

            </div>

        );

        }

export default AssetsChart;