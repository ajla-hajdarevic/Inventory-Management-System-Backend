# Inventory Management System

This type of a software system is used for tracking inventory levels, orders and sales, especially
useful for retail organizations. The main purposes of this kind of a system are improving and
controlling business processes inside an organization.

## Getting Started

1. Clone the GitLab project repository :
git clone https://gitlab.com/edinfazlic/a-group-2018
2. Import the project into your IDE
3. Build and run the application
4. Check the results on http://localhost:8080/greeting

### Prerequisites

1. Java Development Kit(JDK)
2. Integrated Development Environment(IDE) - IntelliJ IDEA
2. Maven

### Installing

1. Set up the SpringBoot
- clone the SpringBoot repository :
   git clone https://github.com/spring-guides/gs-spring-boot.git
- cd into gs-spring-boot/initial
- check the results: gs-spring-boot/complete

2. Install Maven:
- download the zip file at https://maven.apache.org/
- unzip the file and add the _bin_ folder to your path
- test the installation by running **mvn -v** from the command-line

3. Import the project(application) into your IDE(IntelliJ IDEA)

4. Run the application from src/main/java/hello/Application

5. When service is activated, visit  http://localhost:8080/greeting


## Running the tests

1. Test for checking if the @RequestParam arrangement in GreetingController is working as expected: 

Provide a name query string parameter with http://localhost:8080/greeting?name=User to check if the value of the content attribute changes from "Hello, World!" to "Hello User!"( if the default name parameter is overriden)

2. Test for checking if the same GreetingController instance works across multiple requests and whether its counter field increments on each call as expected:

Check whether id attribute increments each time after running the application

## Live demo

To see the live demo click [here](https://pacific-retreat-15979.herokuapp.com/).

## Built With

* [SpringBoot](https://github.com/spring-projects/spring-boot) - The framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [IntelliJ IDEA](https://www.jetbrains.com/idea/) - IDE


## Authors

* **Ajla Hajdarevic** 
* **Azemina Celebic** 
* **Hana Gicevic** 