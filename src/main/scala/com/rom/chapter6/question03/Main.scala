package com.rom.chapter6.question03

//03. Deﬁne an Origin object that extends java.awt.Point. Why is this not actually a
//good idea? (Have a close look at the methods of the Point class.)

object Main {
  object Origin extends java.awt.Point {}

  def main(args: Array[String]): Unit = {
    // strange code
    val o = Origin.move(1, 2)
    println(o)
  }
}
