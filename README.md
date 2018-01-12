# Person API [![Build Status](https://travis-ci.org/vidhya03/http-patch-jax-rs.svg?branch=master)](https://travis-ci.org/vidhya03/http-patch-jax-rs) [![codecov](https://codecov.io/gh/vidhya03/http-patch-jax-rs/branch/master/graph/badge.svg)](https://codecov.io/gh/vidhya03/http-patch-jax-rs) [![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)](https://github.com/vidhya03/http-patch-jax-rs/blob/master/LICENSE.md)
A simple HTTP REST service  web application also called as Person API

# Heads up
- This project has been hosted in Openshift
- Access this project @ http://http-patch-vidhya.1d35.starter-us-east-1.openshiftapps.com/
- Swagger for this API [http-patch-demo-swagger.json](src/main/resources/http-patch-demo-swagger.json)
- [Deeplink](https://raw.githubusercontent.com/vidhya03/http-patch-jax-rs/master/src/main/resources/http-patch-demo-swagger.json) for direct import
- Try this Person API at http://try.personapi.labkit.in/

# Development
- checkout
 ```  
   git clone https://github.com/vidhya03/http-patch-jax-rs.git
```
- compile
```
  cd  http-patch-jax-rs.git
  mvn compile
```
- Test
```
  mvn test
```
# Code Coverage using Jacoco
- To run test and perform code coverage
```
  mvn clean test -Pcoverage
```
and the HTML reports would be output to target/site/jacoco/index.html
![Jacoco Code Coverage Report](src/test/resources/jacoco-html-reports.png) 

# License
* [MIT License](https://github.com/vidhya03/http-patch-jax-rs/blob/master/LICENSE.md)