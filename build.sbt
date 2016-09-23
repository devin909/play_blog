name := """Blog"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "be.objectify" %% "deadbolt-java" % "2.5.0",
  "com.feth" %% "play-authenticate" % "0.8.1-SNAPSHOT",
  "org.webjars" % "bootstrap" % "3.3.7"
)

// add resolver for deadbolt and easymail snapshots
resolvers += Resolver.sonatypeRepo("snapshots")

// display deprecated or poorly formed Java
javacOptions ++= Seq("-Xlint:unchecked")
javacOptions ++= Seq("-Xlint:deprecation")
javacOptions ++= Seq("-Xdiags:verbose")

enablePlugins(PlayEbean)