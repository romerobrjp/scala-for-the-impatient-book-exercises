package com.rom.chapter2

// 2. What is the value of an empty block expression {}? What is its type?
object Question02 extends App {
  val emptyExpression = {}

  println(s"Value of an empty block expression {}: ${emptyExpression}")
  println(s"Type of an empty block expression {}: ${emptyExpression.getClass}")
}
