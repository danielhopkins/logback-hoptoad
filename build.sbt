name := "logback-hoptoad"

version := "1.0"

scalaVersion := "2.9.1"

resolvers += "GeneralSensing Internal Repository - Releases" at "http://nexus.generalsensing.com/content/repositories/releases"

resolvers += "GeneralSensing Internal Repository - Snapshots" at "http://nexus.generalsensing.com/content/repositories/snapshots"

libraryDependencies += "ch.qos.logback" % "logback-core" % "0.9.25"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "0.9.25"

libraryDependencies += "net.databinder" %% "dispatch-http" % "0.7.8"
