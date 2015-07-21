package org.pettswood.runners.sbt

import _root_.org.scalatools.testing._
import org.pettswood.PettswoodConfig
import org.pettswood.files._
import org.pettswood.runners.RecycleableRunner

class PettswoodFramework extends Framework {
  def name() = "Pettswood"
  def tests = Array[Fingerprint](new PettswoodFingerprint)

  private val config: PettswoodConfig = new PettswoodConfig()

  def testRunner(classLoader: ClassLoader, loggers: Array[Logger]) = new Sbt(classLoader, loggers, new RecycleableRunner(config), new PettswoodFiles(config.sourceRoot))
}

class PettswoodFingerprint extends SubclassFingerprint {
  def superClassName = "org.pettswood.runners.sbt.SbtIntegrationHook"
  def isModule = false
}

trait SbtIntegrationHook