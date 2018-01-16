package com.rom.chapter6

//5. Write a Scala application, using the App trait, that prints its command-line
//arguments in reverse order, separated by spaces. For example, scala Reverse
//Hello World should print World Hello.
object Question05 extends App {
  def printInReverseOrder(sentence: String): Unit = {
    val reversedWords: Array[String] = sentence.split(" ").reverse
    reversedWords.foreach { println }
  }

  printInReverseOrder("Write a Scala application, using the App trait, that prints its command-line\n//arguments in reverse order, separated by spaces.")
}
