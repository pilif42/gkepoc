# gkepoc
POC using Google Kubernetes Engine


# To build the application
mvn clean install


# To run the application
- Run config in IntelliJ:
    - pointing to GkePocApplication
    - VM Options = -Dspring.profiles.active=local
- Or: mvn clean package spring-boot:run -DskipTests=true -Dspring-boot.run.profiles=local


# To test the application
- with curl:
  - curl -k -v -H "Accept:application/hal+json" -H "Accept-Language:en-US" -H "Cache-Control:no-store" -X GET 'http://localhost:8080/greeting'
  - 200 {"msg":"Hello local","time":"2021-02-06T08:36:50.319879Z"}


# TODOs
According to https://cloud.google.com/kubernetes-engine, new customers get $300 in free credits to spend on Google Cloud 
during the first 90 days. All customers get one zonal cluster per month for free, not charged against your credits.


# TODOs that we did not complete in the AKS poc
- Update an application: deploy in the cluster 0.0.1-SNAPSHOT. Then, small visible modif and deploy 0.0.2-SNAPSHOT.
- Test my Docker image fully with snyk (Transfer notes from file into here). Attempt to clear some vulnerabilities.
- So far, we have deployed to K8S using port 8080 and without specifying a Spring profile:
    - try to apply the local profile
    - try to use a different port
- Add a DB (or another container) in the mix and use docker-compose.
