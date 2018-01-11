package com.rom.chapter2

// 3. Come up with one situation where the assignment x = y = 1 is valid in Scala. (Hint: Pick a suitable type for x.)
object Question03 extends App {
  var y: Int = 0
  val x: Unit = y = 1

  println(s"y: ${y}")
  println(s"y: ${x}")
}
