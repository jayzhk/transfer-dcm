name := """transfer-dcm"""
organization := "org.medpost"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies += filters
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "org.medpost.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "org.medpost.binders._"
