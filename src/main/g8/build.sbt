import Dependencies._

lazy val root = (project in file("."))
  .settings(
    organization := "$organization$",
    name := "$name;format="norm"$",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "$scala_version$",
    libraryDependencies ++= Seq(
      miniTest % Test,
      spec,
      pureconfig
    ) ++ http4s ++ doobie,
    testFrameworks += new TestFramework("minitest.runner.Framework")
  )

