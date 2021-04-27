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

Use these example requests in your preferred REST API testing tool (e.g. postman or RESTler) or simply in your browser's address bar.

The developers recommend using the commands in the given order to satisfy all dependencies.



### Create new User:

**Type:** PUT

**Returns: **true/false 

**Description:** Creates a new User in the database with the User information provided in the body (JSON). Returns Boolean to confirm correct creation.

**URL:** localhost:8080/user/new

**Body:** 

{
    "id" : "1",
    "name" : "Max Smith",
    "email" : "max.smith@online.com"
}



### Request User

**Type:** GET

**Returns:** User

**Description:** Returns a User object (JSON) with the given ID

**URL:** localhost:8080/user/{user_id}

*Example :* localhost:8080/user/1



### Create new Account linked to existing user:

**Type:** PUT

**Returns: **true/false

**Description:** Creates a new Account in the database with the Account information provided in the body (JSON). Returns Boolean to confirm correct creation.

**URL:** localhost:8080/account/new

**Body:** 

*Example 1:*

{
 	"id" : "1",

  	"name" : "Chase Checking",

  	"user_id" : "1",

  	"balance" : "524,20"

}

*Example 2:*

{
 	"id" : "2",

  	"name" : "Chase Savings",

  	"user_id" : "1",

  	"balance" : "5398,00"

}



### Request Account

**Type:** GET

**Returns:** Account

**Description:** Returns an Account object (JSON) with the given ID

**URL:** localhost:8080/account/{account_id}

*Example 1:* localhost:8080/account/1

*Example 2:* localhost:8080/account/2



### Create new Transaction linked to existing account:

**Type:** PUT

**Returns: **true/false

**Description:** Creates a new Transaction in the database with the Transaction information provided in the body (JSON). Returns Boolean to confirm correct creation.

**URL:** localhost:8080/transaction/new

**Body:** 

*Example 1:*

{

​	"date" : "2021-27-04T10:00:00",

 	"id" : "1",

​	"value" : "200.00",

​	"isBill" : "false",

​	"account_id" : "1"

}

*Example 2:*

{
 	"date" : "2021-27-04T11:00:00",

 	"id" : "2",

​	"value" : "53,00",

​	"isBill" : "false",

​	"account_id" : "1"

}



### Request Transaction

**Type:** GET

**Returns:** Transaction

**Description:** Returns a transaction object (JSON) with the given ID

**URL:** localhost:8080/transaction/{transaction_id}

*Example 1:* localhost:8080/transaction/1

*Example 2:* localhost:8080/transaction/2



### Create new Loan linked to existing user:

**Type:** PUT

**Returns: **true/false

**Description:** Creates a new Loan in the database with the Loan information provided in the body (JSON). Returns Boolean to confirm correct creation.

**URL:** localhost:8080/loan/new

**Body:** 

*Example 1:*

{

​	"id" : "1",

​	"user_id" : "1",

​	"amount" : "5500.00",

​	"paid_off" : "500.00",

​	"creation_date" : "2021-05-01T15:35:00"

​	"interest_rate" : "1.5",

​	"name" : "2010 Mercedes"

}

*Example 2:*

{
 	"id" : "2",

​	"user_id" : "1",

​	"amount" : "80000.00",

​	"paid_off" : "34000.00",

​	"creation_date" : "2019-01-01T12:00:00"

​	"interest_rate" : "0.8",

​	"name" : "Chicago apartment"

}



### Request Loan

**Type:** GET

**Returns:** Loan

**Description:** Returns a loan object (JSON) with the given ID

**URL:** localhost:8080/loan/{user_id}/{loan:_id}

*Example 1:* localhost:8080/loan/1/1

*Example 2:* localhost:8080/loan/1/2



### Request Debt

**Type:** GET

**Returns:** double

**Description:** Returns the debt of a user: Loans - amount paid off + credit card balances

**URL:** localhost:8080/debts/{user_id}

*Example :* localhost:8080/debts/1



### Request Assets

**Type:** GET

**Returns:** double

**Description:** Returns all assets of a user: Sum of all accounts

**URL:** localhost:8080/assets/{user_id}

*Example :* localhost:8080/assets/1