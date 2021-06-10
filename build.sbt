val LaikaVersion = "0.17.1"

lazy val root = (project in file("."))
  .settings(
    name := "laika-empty-string",
    scalaVersion := "2.13.6",
    libraryDependencies ++= Seq(
      "org.planet42"        %% "laika-core"             % LaikaVersion,
    )
  )