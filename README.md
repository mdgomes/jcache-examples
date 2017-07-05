#JCache examples

The three projects in this repository show three different approaches on how you can configure JSR107 annotations to work on a project all of them using Hazelcast as the cache manager.

##jcache-ri

This project uses the reference implementation of the JSR107 annotations and generates a war file that should be able to be deployed on JavaEE 7 compatible application servers.

To build the war file run

```
./gradlew clean build
```

Deploy the application according to the specific application server used.

##jcache-payara

This project generates an uber jar which contains Payara Micro. Since both hazelcast and JSR107 are offered by Payara out of the box, these dependencies are not needed to be explicitly specified on the project.

To build the uber-jar run

```
./gradlew uberJar
```

To run the application

```
java -jar build/libs/payara-cache.jar
```


##jcache-spring

This project uses spring boot instead of JavaEE. In this case the reference implementation of the JSR107 annotations is not necessary but the dependency to the jcache API is necessary.

To build the uber-jar run

```
./gradlew clean build
```

To run the application

```
java -jar spring-cache-1.0-SNAPSHOT.jar
```
