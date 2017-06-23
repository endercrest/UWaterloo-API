UWaterloo API - Java Library
-----

## About
This is a java library that access the University of Waterloo Open Data API. 
The official documentation can be found [here](https://github.com/uWaterloo/api-documentation)

This library was created to take away the overhead of accessing the API and not having to
worry about parsing the information.

## Installation & Usage

#### Installation
To get started quickly, add the following to your maven pom to add UWaterlooAPI to your project, which is downloaded
through Maven Central
```xml
<dependency>
    <groupId>com.endercrest.uwaterlooapi</groupId>
    <artifactId>UWaterlooAPI</artifactId>
    <version>1.0.1</version>
</dependency>
```

#### Usage
To get started with this library begin by initializing UWaterlooAPI class which contains all API classes.
Alternatively, you can initialize individual API's classes as needed.

Here is an example.
```java
public class Start {
    public static void main(String[] args){
        UWaterlooAPI uWaterlooAPI = new UWaterlooAPI("My-API-Here");

        //Get my total api calls with this api key.
        int totalCalls = uWaterlooAPI.getApiAPI().getUsage().getData().getTotalCalls();
        System.out.println("My Total Calls:" + totalCalls);

        //Do Something with the totalCalls
    }
}
```

## Requirements & Compiling
#### Requirements
This library requires GSON, [by Google](https://github.com/google/gson), to parse the information and therefore must 
be included in the final project.

This library also requires an API key which is distributed by the University of Waterloo. You can get your API key
 from https://api.uwaterloo.ca

#### Compiling
Requirements for downloading and compiling: `Maven 3 & Git`

Start with cloning the repository, and navigating to the working directory.
Then to compile the project run the command `mvn install`. This will package
the library and install it into your local maven repository which will make 
that specific version available for use locally.

## Contributing & Reporting Issues
Any and all contributions are welcome, at this time testing and full documentation is lacking.

If any bugs are found, open a new issue in the bug tracker, and it should be resolved as soon as possible.

## Acknowledgements
* University of Waterloo
