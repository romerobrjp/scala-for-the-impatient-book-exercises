package com.rom.chapter2

//Make the function of the preceding exercise a recursive function.
object Question09 extends App {
  def recursiveProduct(s: String, index: Int = 0, product: Long = 1): Long = {
    if (index >= s.length) product
    else {
      var partialProduct: Long = product * s(index).toLong
      recursiveProduct(s, index + 1, partialProduct)
    }
  }

  assert(recursiveProduct("Hello") == 9415087488L)
  print(recursiveProduct("Hello"))
}