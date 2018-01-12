package com.rom.chapter4

import java.io.File
import java.util.Scanner

import com.rom.chapter4.Question03.{fileContent, words}

import scala.collection.immutable.SortedMap

//4. Repeat the preceding exercise with a sorted map, so that the words are
//printed in sorted order.
object Question04 extends App {
  val filePath: String = ""
  val in = new Scanner(new File(filePath))
  val source = scala.io.Source.fromFile(filePath)
  val fileContent = try source.mkString finally source.close()
  val words = fileContent.split("\\W+")
  val result = SortedMap[String, Int]() ++ (for (word <- words.distinct) yield (word, words.count(_ == word)))
  result.foreach(println(_))
}
