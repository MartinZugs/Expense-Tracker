import React from 'react';
import * as am4core from "@amcharts/amcharts4/core";
import * as am4charts from "@amcharts/amcharts4/charts";
import am4themes_animated from "@amcharts/amcharts4/themes/animated";
import "./totalSpending.css"
import {Component} from "react";



am4core.useTheme(am4themes_animated);
class TotalSpending extends Component {

    componentDidMount() {


// Create chart instance
        const chart = am4core.create("chartdiv", am4charts.PieChart);

// Add data
        chart.data = [{
            "country": "Entertainment",
            "litres": 501.9
        }, {
            "country": "Groceries",
            "litres": 301.9
        }, {
            "country": "Rent",
            "litres": 201.1
        }, {
            "country": "Car Note",
            "litres": 165.8
        }, {
            "country": "Utilities",
            "litres": 139.9

        }];

// Add and configure Series
        const pieSeries = chart.series.push(new am4charts.PieSeries());
        pieSeries.dataFields.value = "litres";
        pieSeries.dataFields.category = "country";

// Let's cut a hole in our Pie chart the size of 40% the radius
        chart.innerRadius = am4core.percent(40);

// Set up fills
        pieSeries.slices.template.fillOpacity = 1;

        const hs = pieSeries.slices.template.states.getKey("hover");
        hs.properties.scale = 1;
        hs.properties.fillOpacity = 0.5;
    }
    componentWillUnmount() {
        if (this.chart) {
            this.chart.dispose();
        }
    }
        render() {
            return (
                <div className="total-spending-container">
                    <h3>Total Spending</h3>

                    <div className id="chartdiv" style={{width: "60%", height: "200px"}}></div>

                </div>
            )

        }

}

export default TotalSpending;