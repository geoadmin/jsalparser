scalaVersion := "2.11.8"

libraryDependencies += "org.antlr" % "antlr4-runtime" % "4.5.3"


publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
