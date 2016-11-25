name := "BleezeNd4jBenchmark"

version := "1.0"

classpathTypes += "maven-plugin"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")

scalaVersion := "2.11.8"

resolvers += "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"

libraryDependencies  ++= Seq(
  // Last stable release
  "org.scalanlp" %% "breeze" % "0.12",

  // Native libraries are not included by default. add this if you want them (as of 0.7)
  // Native libraries greatly improve performance, but increase jar sizes.
  // It also packages various blas implementations, which have licenses that may or may not
  // be compatible with the Apache License. No GPL code, as best I know.
  "org.scalanlp" %% "breeze-natives" % "0.12",

  // The visualization library is distributed separately as well.
  /// It depends on LGPL code
  "org.scalanlp" %% "breeze-viz" % "0.12"
)

libraryDependencies += "junit" % "junit" % "4.12"
libraryDependencies += "log4j" % "log4j" % "1.2.17"

libraryDependencies += "org.deeplearning4j" % "deeplearning4j-core" % "0.6.0"

libraryDependencies += "org.nd4j" % "nd4j-backends" % "0.6.0"
libraryDependencies += "org.nd4j" % "nd4j" % "0.6.0"
libraryDependencies += "org.nd4j" % "nd4j-api-parent" % "0.6.0"
libraryDependencies += "org.nd4j" % "nd4j-api" % "0.6.0"
libraryDependencies += "org.nd4j" % "nd4j-backend-impls" % "0.6.0"
libraryDependencies += "org.nd4j" % "nd4j-native" % "0.6.0" classifier "" classifier "macosx-x86_64"
libraryDependencies += "org.nd4j" % "nd4j-buffer" % "0.6.0"
libraryDependencies += "org.nd4j" % "nd4j-common" % "0.6.0"
libraryDependencies += "org.nd4j" % "nd4j-context" % "0.6.0"
libraryDependencies += "org.nd4j" % "nd4s_2.11" % "0.6.0"
libraryDependencies += "org.nd4j" % "nd4j-native-platform" % "0.6.0"
libraryDependencies += "org.nd4j" % "nd4s_2.11" % "0.6.0"

libraryDependencies += "colt" % "colt" % "1.2.0"

libraryDependencies += "org.la4j" % "la4j" % "0.6.0"
