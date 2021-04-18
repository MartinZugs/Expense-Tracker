import './budgetChart.css';
import Chart from "react-google-charts";

const BudgetChart = () =>  {

    const dateObj = new Date()
    const monthName = dateObj.toLocaleString("default", { month: "long" })

    return (
        <div className="budget-chart-container">
            <h3>{monthName} Budget Chart</h3>
            <Chart
                width={'600px'}
                height={'400px'}
                chartType="PieChart"
                loader={<div>Loading Chart</div>}
                data={[
                    ['Expenses', 'Percentage'],
                    ['Entertainment', 200],
                    ['Groceries', 300],
                    ['Car Note', 500],
                    ['Rent', 1000],
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

export default BudgetChart;