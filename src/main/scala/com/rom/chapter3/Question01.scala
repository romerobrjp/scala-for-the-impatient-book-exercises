package com.rom.chapter3

import scala.util.Random

//1. Write a code snippet that sets a to an array of n random integers between 0
//(inclusive) and n (exclusive).
object Question01 extends App {
  def generateAndPrintRandomArray(n: Int): Unit = {
    val arraySize: Int = Random.nextInt(n-1)
    val a: Array[Int] = new Array(arraySize)
    for (i <- 0 to arraySize-1) a(i) = Random.nextInt(n-1)
    println(s"arraySize: ${arraySize}")
    print(s"Array values: ${a.mkString("[", "|", "]")}")
  }

  generateAndPrintRandomArray(50)
}
