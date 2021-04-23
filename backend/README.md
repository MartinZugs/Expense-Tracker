# Expense Tracker Backend



This project implements a backend web service for an expense tracker website.



**Developer**: Marius Ebert, Martin Zugschwert

**Language**: Java

**API**: REST

**Framework**: Spring







## Functionality

This service uses HTTP GET, POST and PUT requests to exchange data with an expense tracker website. The data is stored in a MySQL database and can be retrieved through the RREST API. The functionality includes general actions like creating accounts, generating users, storing transactions, retrieve account information, ...





## Build

After cloning the project from git, use

> ​	gradlew build

to build the project and

> ​	gradlew bootrun

to run it locally. The web service should be available on http://localhost:8080.  See below for example usages of the service.



During the build, the project will run automated tests that can be found in src/test/java/web/.







## Example requests

Use these example requests in your preferred REST API testing tool or simply in your browser's address bar.





FOLLOWING NEEDS TO BE UPDATED:

### Create new User:

**Type:** GET

**URL:** localhost:8080/newUser



### Request user point balance

**Type:** GET

**URL:** localhost:8080/balance?user=0



### Request list of points per payer:

**Type:** GET

**URL:** localhost:8080/payer_list?user=0



### Add Transaction

**Type:** POST

**URL:** localhost:8080/transaction/0

**Body:**

{
	"payer_name" : "DANNON",
	"points" : "300",
	"date" : "2021-30-01T17:08:48"
}



### Make payment

**Type:** GET

**URL:** localhost:8080/pay?amount=100&user=0

