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



### Create new User:

**Type:** POST

**Returns: **true/false

**URL:** localhost:8080/user/new

**Body:** 

{
    "id" : "1",
    "first_name" : "Max",
    "last_name" : "Smith",
    "email" : "max.smith@online.com"
}



### Request user

**Type:** GET

**Returns:** User

**URL:** localhost:8080/user/1

