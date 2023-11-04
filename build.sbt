val http4sVersion = "0.23.23"
val grackleVersion = "0.15.0"
val catsVersion = "2.10.0"
val catsParseVersion = "0.3.10"
val catsEffectVersion = "3.5.2"
val circeVersion = "0.14.1"

scalaVersion := "3.3.1"

libraryDependencies ++= Seq(
  "org.http4s" %% "http4s-ember-client" % http4sVersion,
  "org.http4s" %% "http4s-ember-server" % http4sVersion,
  "org.http4s" %% "http4s-dsl" % http4sVersion,
  "org.http4s" %% "http4s-circe" % http4sVersion,
  "org.typelevel" %% "grackle-core" % grackleVersion,
  "org.typelevel" %% "grackle-generic" % grackleVersion,
  "org.typelevel" %% "grackle-circe" % grackleVersion,
  "org.typelevel" %% "cats-core" % catsVersion,
  "org.typelevel" %% "cats-effect" % catsEffectVersion,
  "io.circe" %% "circe-core" % circeVersion,
  "io.circe" %% "circe-generic" % circeVersion,
  "io.circe" %% "circe-parser" % circeVersion
)
