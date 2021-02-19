# Java µService Project Generator

This is a maven archetype for generating Java µServices project that uses SpringBoot.

## PreRequisites
* Maven
* JDK 1.8+
* JRE 1.8+

## Steps to Generate Project 

* Clone the repository to local system

* Run ``mvn install`` from the repository root directory

* Once `BUILD SUCESS` the archetype is installed in the local maven repository

* Copy the `projectgenerator.sh` from the repository directory to the path where you would like to generate the project.

* Run `sh projectgenerator.sh <µServiceApplication name>`

### Example
``sh projectgenerator.sh ourfirstmicroservice``

* The project generator starts building the project based on base setup. Once `Generating Project in Interactive mode ` starts it asks user prompt 

``package: com.springboot``

``Y: : `` type `N` and press enter

* Again the generator will ask for user prompt ``Define value for property 'package' com.springboot: :``

* Enter ``com.springboot.<µServiceApplication name>``

### Example
``com.springboot.outfirstmicroservice``

* Once `BUILD SUCCESS` the project is successfully generated.

* Below is the sample structure you would get once inside the project directory
````
.
├── pom.xml
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── springboot
    │   │           └── outfirstmicroservice
    │   │               ├── config
    │   │               │   └── SampleApplicationConfig.java
    │   │               ├── controllers
    │   │               │   └── SampleApplicationController.java
    │   │               ├── exception
    │   │               │   └── SampleException.java
    │   │               ├── filters
    │   │               │   └── SampleFilter.java
    │   │               ├── models
    │   │               │   └── SampleModel.java
    │   │               ├── repositories
    │   │               │   └── SampleRepository.java
    │   │               ├── requests
    │   │               │   └── SampleRequest.java
    │   │               ├── responses
    │   │               │   └── SampleResponse.java
    │   │               ├── SampleApplication.java
    │   │               ├── service
    │   │               │   └── SampleService.java
    │   │               └── utils
    │   │                   └── SampleUtils.java
    │   └── resources
    │       ├── application-prod.properties
    │       ├── application.properties
    │       └── application-uat.properties
    │       └── logback-spring.xml
    └── test
        └── java
            └── com
                └── springboot
                    └── outfirstmicroservice
                        └── SampleApplicationTest.java

22 directories, 16 files
````

* Make Neccessary changes in logback-spring.xml
* Make Neccessary changes in Dockerfile