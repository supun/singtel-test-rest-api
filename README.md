# singtel-test-rest-api

This is Spring Boot Application. Run the Application.java class and application will run on 

    http://localhost:9090/.

API documentation is available at 
    
    http://localhost:9090/v2/api-docs

H2 in memory db is used to store objects.

Sample API requests for retrieveing data : 

    http://localhost:9090/api/v1/animals  // this endpoint has the sample data insertion part ws well. Then it returns the saved data from db.
    http://localhost:9090/api/v1/animal/1

