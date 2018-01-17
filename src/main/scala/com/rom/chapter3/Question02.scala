package com.rom.chapter3

import scala.util.Random

//Write a loop that swaps adjacent elements of an array of integers. For example,
//Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5).
object Question02 extends App {
  val arr: Array[Int] = Array[Int](1, 2, 3, 4, 5, 6, 7, 8, 9)
  var newArr: Array[Int] = new Array[Int](9)

  var i: Int = 0
  while (i < arr.length) {
    if (i < (arr.length - 2)) {
      newArr(i + 1) = arr(i)
      newArr(i) = arr(i + 1)
    }
    i += 2
  }
  newArr(newArr.length-1) = arr(arr.length-1)

  println(s"Original array values: ${arr.mkString("[", "|", "]")}")
  println(s"Permuted array values: ${newArr.mkString("[", "|", "]")}")
}
