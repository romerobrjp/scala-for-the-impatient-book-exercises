package com.rom.chapter2

//Write a for loop for computing the product of the Unicode codes of all letters
//in a string. For example, the product of the characters in "Hello" is 9415087488L.
object Question06 extends App {
  def translateStringToUnicode(word: String) {
    var product: Long = 1
    for (letter <- word) product *= letter.toLong
    print(product)
  }

  translateStringToUnicode("Hello")
}