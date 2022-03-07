ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.1"
libraryDependencies += "com.github.sbt" % "junit-interface" % "0.13.3" % Test

lazy val root = (project in file("."))
  .settings(
    name := "pps-21-22-lab02"
  )
