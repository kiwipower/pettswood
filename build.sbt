name := "pettswood"

organization := "com.github.agmenc"

version := "0.2.5"

scalaVersion := "2.13.1"

crossScalaVersions := Seq("2.11.7", "2.12.10", "2.13.1")

scalacOptions ++= Seq("-unchecked", "-Yrangepos", "-language:postfixOps")

testFrameworks += new TestFramework("org.pettswood.runners.sbt.PettswoodFramework")

libraryDependencies ++= Seq(
  "net.sourceforge.htmlcleaner" % "htmlcleaner" % "2.8",
  "org.xmlunit" % "xmlunit-core" % "2.6.2",
  "org.xmlunit" % "xmlunit-legacy" % "2.5.1",
  "org.scala-lang.modules" %% "scala-xml" % "1.2.0",
  "org.specs2" %% "specs2-core" % "4.8.3" % "test",
  "org.specs2" %% "specs2-mock" % "4.8.3" % "test",
  "org.specs2" %% "specs2-junit" % "4.8.3" % "test",
  "org.specs2" %% "specs2-matcher-extra" % "4.8.3" % "test",
  "junit" % "junit" % "4.8.1" % "test" withSources(),
  "org.scala-tools.testing" % "test-interface" % "0.5"
)

// --------- Publishing -----------------------

pomExtra := {
  <url>https://github.com/agmenc/Pettswood</url>
    <licenses>
      <license>
        <name>GPL version 3 or any later version</name>
        <url>http://www.gnu.org/licenses/gpl.html</url>
        <distribution>repo</distribution>
      </license>
    </licenses>
    <scm>
      <url>git@github.com:agmenc/Pettswood</url>
      <developerConnection>scm:git:git@github.com:agmenc/Pettswood.git</developerConnection>
      <connection>scm:git:git@github.com:agmenc/Pettswood.git</connection>
    </scm>
    <developers>
      <developer>
        <id>agmenc</id>
        <name>Chris Agmen-Smith</name>
        <url>https://github.com/agmenc/Pettswood</url>
      </developer>
    </developers>
}
