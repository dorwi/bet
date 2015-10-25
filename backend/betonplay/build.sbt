name := """betonplay"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  javaJpa,
  cache,
  javaWs
)

libraryDependencies += "org.hibernate" % "hibernate-entitymanager" % "5.0.2.Final"
libraryDependencies += "joda-time" % "joda-time" % "2.8.2"
libraryDependencies += "junit" % "junit" % "4.12" % "test"
libraryDependencies ++= Seq(
  "com.fasterxml.jackson.core" % "jackson-core" % "2.6.1",
  "com.fasterxml.jackson.core" % "jackson-annotations" % "2.6.1",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.6.1",
  "com.fasterxml.jackson.module" % "jackson-module-paranamer" % "2.6.1"
)


// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
