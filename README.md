# JCache examples

The projects in this repository show three different approaches on how JSR107 annotations can be configured on an application, all of them using Hazelcast as the cache provider.

## jcache-ri

This project uses the reference implementation of the JSR107 annotations and generates a war file that can be deployed on JavaEE 7 compatible application servers.

To build the war file run

```
./gradlew clean build
```

Deploy the application according to the specific application server used.

## jcache-payara

This project generates an uber jar which contains Payara Micro. Since both hazelcast and JSR107 are offered by Payara out of the box, these dependencies are not needed to be explicitly specified on the project.

To build the uber-jar run

```
./gradlew uberJar
```

To run the application

```
java -jar build/libs/payara-cache.jar
```


## jcache-spring

This project uses spring boot instead of JavaEE. In this case only the dependency to the jcache API is necessary.

To build the uber-jar run

```
./gradlew clean build
```

To run the application

```
java -jar spring-cache.jar
```
