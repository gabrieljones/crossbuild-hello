plugins {
  scala
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