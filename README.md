# Mathzone 

 REST API in Spring boot using Maven that contains one GET  method (getSolution)that does the following:
  
 Find the smallest number that can be divided by a sequential set of numbers:
 
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
360360 is the smallest number that can be divided by each of the numbers from 1 to 15 without any remainder.
And so on..
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 25? Hint: the solution is bigger than int32. 

# Steps to run
Build the project using mvn clean install

Run using mvn spring-boot:run

The web application is accessible via localhost:5000/api/v1/getSmallestDivisibleNum/{n} where {n} has to be replaced by a number. 

For Example, https://localhost:5000/api/v1/getSmallestDivisibleNum/25  should return a json response:

{
"problem":"25",
"solution":"26771144400"
}

Application deployed in Heroku for demo accesible via https://mathzone-west.herokuapp.com/api/v1/getSmallestDivisibleNum/25
