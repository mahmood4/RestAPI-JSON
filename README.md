# Book Store API Testing

This is a test automation project for a Book Store API. The project is written in Java and uses RestAssured, Cucumber, and JUnit.

The Book Store API Testing project aims to automate the testing of a Book Store API. It includes various to ensure the functionality and reliability of the API. The tests are written in Gherkin language using Cucumber, and the assertions are made using RestAssured library. JUnit is used as the test runner.

### Technologies Used
The following technologies and libraries are used in this project:

- Java: Programming language used for writing the tests.
- RestAssured: Library used for making HTTP requests and validating responses.
- Cucumber: Framework used for writing BDD-style test scenarios.
- JUnit: Test runner used for executing the tests.

## Table of Contents
- [Installation](#installation)
- [Usage](#usage)
- [Tests](#tests)
- [Contributing](#contributing)
- [License](#license)

## Installation

To use this project, you need to have the following software installed on your machine:
- Java Development Kit (JDK)
- Maven

You can download the JDK from the official Oracle website: https://www.oracle.com/java/technologies/javase-jdk11-downloads.html

Maven can be downloaded from: https://maven.apache.org/download.cgi

Once you have installed the necessary software, you can clone this repository using the following command:

```git clone https://github.com/githsem/BookStore_API_Testing.git```

## Usage

To run the tests, navigate to the project directory and execute the following command:

```mvn test```

This will run all the tests in the project.

## Tests

The tests are written using Cucumber and JUnit. They are located in the `src/test/java` directory. The feature files can be found in `src/test/resources/features`.

The project follows a BDD (Behavior Driven Development) approach where each feature file describes a specific behavior of the Book Store API. The step definitions for these features can be found in `src/test/java/stepdefinitions`.

After running the tests, the test reports can be found in the project. Open the HTML report file to view the detailed test results.

## Contributing

If you would like to contribute to this project, feel free to fork the repository and submit a pull request with your changes. Please make sure to follow the existing coding style and add appropriate tests for any new functionality.

## License

This project is licensed under the [MIT License](LICENSE).
