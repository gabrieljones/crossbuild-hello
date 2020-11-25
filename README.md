#### See new tasks added by plugin
```shell script
./gradlew tasks
```

#### Compile default Scala version
```shell script
./gradlew clean build
```

#### Compile specific version
```shell script
./gradlew clean crossBuildScala_211Jar crossBuildScala_212Jar
```

#### Compile and publish locally all defined publications
```shell script
./gradlew clean publishToMavenLocal
```
