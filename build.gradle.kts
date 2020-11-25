plugins {
  scala
  id("com.github.prokod.gradle-crossbuild-scala") version "0.12.0"
}

archivesBaseName = "crossbuild-hello"

crossBuild {
  builds {
    scala {
      scalaVersions = ["2.11", "2.12", "2.13"]
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