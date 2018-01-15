package com.rom.chapter4

import java.io.File
import java.util.Scanner
import scala.collection.JavaConversions.mapAsScalaMap

//5. Repeat the preceding exercise with a java.util.TreeMap that you adapt to the Scala API.
object Question05 extends App {
  val filePath: String = "/home/romero/Desktop/lorem.txt"
  val in = new Scanner(new File(filePath))
  var dictionary: scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int]

  while (in.hasNext()) {
    val word = in.next()
    if (dictionary.contains(word))
      dictionary(word) += 1
    else
      dictionary(word) = 1
  }

  print(dictionary)
}
