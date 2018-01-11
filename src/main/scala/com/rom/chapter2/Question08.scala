package com.rom.chapter2

//Write a function product(s : String) that computes the product, as described in the preceding exercises.
object Question08 extends App {
  def product(s: String): Long = {
    s.map(_.toLong).product
  }

  print(product("Hello"))
  assert(product("Hello") == 9415087488L)
}
