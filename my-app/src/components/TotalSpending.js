import "./totalSpending.css"
import React, { PureComponent } from 'react';
import { PieChart, Pie, Sector, Cell, Legend, ResponsiveContainer } from 'recharts';


const TotalSpending = () =>{
    const data = [
        { name: 'Entertainment', value: 200 },
        { name: 'Groceries', value: 400 },
        { name: 'Rent', value: 1500 },
        { name: 'Car Note', value: 450 },
    ];

    const COLORS = ['#99CC00', '#006600', '#00CC00', '#99FF00'];

    const RADIAN = Math.PI / 180;
    const renderCustomizedLabel = ({ cx, cy, midAngle, innerRadius, outerRadius, percent, index }) => {
        const radius = innerRadius + (outerRadius - innerRadius) * 0.5;
        const x = cx + radius * Math.cos(-midAngle * RADIAN);
        const y = cy + radius * Math.sin(-midAngle * RADIAN);
        return (
            <text x={x} y={y} fill="white" textAnchor={x > cx ? 'start' : 'end'} dominantBaseline="central">
                {`${ (percent * 100).toFixed(0)}%` }
            </text>
        );
    }

    return (
        <div className="total-spending-container">
            <h3>Total Spending</h3>

        <ResponsiveContainer width="70%" height="100%">
            <PieChart width={200} height={150}>
                <Pie
                    data={data}
                    cx="50%"
                    cy="50%"
                    labelLine={false}
                    label={renderCustomizedLabel}
                    outerRadius={80}
                    fill="#8884d8"
                    dataKey="value"
                >
                    {data.map((entry, index) => (
                        <Cell key={`cell-${index}`} fill={COLORS[index % COLORS.length]} />
                    ))}
                </Pie>
            </PieChart>
        </ResponsiveContainer>
        </div>
    )

}


export default TotalSpending;