
name := "scala-native-playground"

version := "0.1"

scalaVersion := "2.11.8"

/**
  * Scala Native supports following Scala versions for corresponding releases:
  * 
  * Scala Native Version	Scala Versions
  * 0.1.x	                2.11.8
  * 0.2.x	                2.11.8, 2.11.11
  * 0.3.0-0.3.3	          2.11.8, 2.11.11
  * 0.3.4+	              2.11.8, 2.11.11, 2.11.12
  */
enablePlugins(ScalaNativePlugin)

resolvers += "mmreleases" at "https://artifactory.mediamath.com/artifactory/libs-release-global"
resolvers += Resolver.sonatypeRepo("releases")

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

libraryDependencies += "com.mediamath" %%% "scala-json" % "1.0"
