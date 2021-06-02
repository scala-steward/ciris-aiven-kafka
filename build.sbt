organization := "com.ovoenergy"
licenses += ("MIT", url("https://opensource.org/licenses/MIT"))

scalaVersion := "2.13.5"
crossScalaVersions := Seq(scalaVersion.value, "2.12.13")
releaseCrossBuild := true

libraryDependencies += "is.cir" %% "ciris" % "2.0.0-RC2"

publishTo := Some("Artifactory Realm" at "https://kaluza.jfrog.io/artifactory/maven")
ThisBuild / versionScheme := Some("early-semver")

