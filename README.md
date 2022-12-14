# Assignment

[Click here to read the assignment](./docs/assignment.md)

## vanilla

This is a base starter kit framework that you can use to build your tests for the above assignment.
However, if you are more comfortable with your own tool kit, feel free to use that as well!

## External dependencies

For this project to run, you would need to install below 3 dependencies on your machine:

- **[Java 11](https://openjdk.java.net/projects/jdk/11/)** (as the core programming language)
- **[Maven 3.8.5](https://maven.apache.org/download.cgi)** (for dependency management)
- **[Google Chrome latest version](https://www.google.com/chrome/?brand=CHBD&gclid=Cj0KCQjwr-SSBhC9ARIsANhzu15P0PA-n9Zp4NpxKaOHVGtBD1TZQH0HlQQE6hUfsOFAU1nf-Rzdlf4aAoTJEALw_wcB&gclsrc=aw.ds)** (browser to run your tests)

> If your JAVA_HOME is set to anything other than JDK 11, you would need to update the path. Else your project
> will not run. Also, do remember to set the correct JDK settings in your IDE.

## Getting Started
    Have used POM (Page Object Design Patter ) So we can bind locator and method in the same class Using page factor class using this we are achivinf below points
        i. Code reuse
        ii. Easy to read & maintenance of code

1. Created Pages Package [test/java/pages] : 
   1. BasePage: Use to init all pages locator
   2. HomePage : All locator from amazon home page with browse intraction with in that page 
   3. Television Page : All locator in television page with user action with in that page 
   4. ProductPage : locator in product page with user action in that page
    
2. TestScripts Package [test/java/TestScripts] : All tests for project
   1. BaseTest  : Getting webdriver instance and performing common browser  action so we can reuse across diffrent test. 
   2. VerifyProduct : Test Scripts for verify product "About this Item" section

    
> Run Code : mvn test 

