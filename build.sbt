name := "Kafka Playground"

version := "0.0.1"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "com.lightbend" %% "kafka-streams-scala" % "0.2.0",
  "org.apache.kafka" % "kafka-clients" % "1.0.0"
)

assemblyOutputPath in assembly := file("target/kafka-playground/kafka-playground.jar")
