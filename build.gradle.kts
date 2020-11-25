plugins {
  id("com.github.prokod.gradle-crossbuild") version "0.12.0"
  `maven-publish`
}

base {
  archivesBaseName = "crossbuild-hello"
}

crossBuild {
  builds {
    register("scala") {
      scalaVersions = setOf("2.11", "2.12", "2.13")
    }
  }
}

repositories {
  google()
  jcenter()
  mavenCentral()
}

dependencies {
  implementation("org.scala-lang:scala-library:2.13.3")
  testImplementation("org.scalatest:scalatest_2.13:3.2.1")
}

val crossBuildScala_211Jar by tasks.getting

// 'maven-publish' plugin usage for publishing crossbuild artifacts
publishing {
  publications {
    register("crossBuildScala_211", MavenPublication::class) {
      groupId = "some.group.org"
      artifact(crossBuildScala_211Jar)
    }
  }
}
