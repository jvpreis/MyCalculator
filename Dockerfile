FROM anapsix/alpine-java
ADD target/MyCalculator-*.jar /home/myjar.jar
CMD ["java","-jar","/home/myjar.jar"]
