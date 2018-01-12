package com.rom.chapter4

import java.io.File
import java.util.Scanner

//3. Repeat the preceding exercise with an immutable map.
object Question03 extends App {
  val filePath: String = ""
  val in = new Scanner(new File(filePath))
  val source = scala.io.Source.fromFile(filePath)
  val fileContent = try source.mkString finally source.close()
  var words = fileContent.split("\\W+")
  val result = (for (word <- words) yield (word, words.count(_ == word))).toMap
  result.foreach(println(_))
}
