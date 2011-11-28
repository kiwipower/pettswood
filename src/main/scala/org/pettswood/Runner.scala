package org.pettswood

import util.Properties._
import scala.xml.Node
import java.io.File

class Runner(parser: Parser, fileSystem: FileSystem) {

  def run(inputPath: String) {
    val rawResult = execute(load(inputPath))
    val result = parser.decorate(rawResult)
    write(result, outputPath(inputPath))
  }

  def load(inputPath: String): Node = fileSystem load absolute(inputPath)
  def execute(test: Node): Node = parser.parse(test)
  def write(result: Node, path: String) { fileSystem save result.toString() to path}
  def absolute(path: String) = userDir + File.separator + path
  def outputPath(path: String) = absolute(path replace("src/test/resources", "target/pettswood"))
}