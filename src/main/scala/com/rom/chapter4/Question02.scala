package com.rom.chapter4

import java.io.File
import java.util.Scanner

//2. Write a program that reads words from a file. Use a mutable map to count
//how often each word appears. To read the words, simply use a java.util.Scanner:
//val in = new java.util.Scanner(new java.io.File("myfile.txt"))
//while (in.hasNext()) process in.next()
//Or look at Chapter 9 for a Scalaesque way.
//At the end, print out all words and their counts.
object Question02 extends App {
  val filePath: String = "C:\\Users\\rmeireles\\Desktop\\lorem.txt"
  val in = new Scanner(new File(filePath))
  var dictionary = scala.collection.mutable.Map[String, Int]()

  while (in.hasNext()) {
    val word = in.next()
    if (dictionary.contains(word))
      dictionary(word) += 1
    else
      dictionary(word) = 1
  }

  print(dictionary)
}