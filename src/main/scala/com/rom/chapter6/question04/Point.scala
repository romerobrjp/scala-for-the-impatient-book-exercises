package com.rom.chapter6.question04

//Deﬁne a Point class with a companion object so that you can construct Point
//instances as Point(3, 4), without using new.
class Point(a: Int, b: Int) {
  val pa = a
  val pb = b
}

object Point {
  def apply(a: Int, b: Int) = {
    new Point(a, b)
  }
}