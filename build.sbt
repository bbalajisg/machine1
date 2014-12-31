
import sbtassembly.Plugin._
import AssemblyKeys._


assemblySettings

jarName in assembly := "machine1.jar"


name := "machine1"

version := "1.0"

scalaVersion :="2.10.3"

libraryDependencies ++= Dependencies.machine1

resolvers +=  "Central Maven" at "http://central.maven.org/maven2/"

mainClass := Some("com.balab.akka.MainApp")