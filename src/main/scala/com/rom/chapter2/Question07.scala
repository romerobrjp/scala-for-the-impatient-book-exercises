package com.rom.chapter2

object Question07 extends App {
  def translateStringToUnicode(word: String) {
    print(word.foldLeft(1L)(_ * _))
  }

  translateStringToUnicode("Hello")
}
