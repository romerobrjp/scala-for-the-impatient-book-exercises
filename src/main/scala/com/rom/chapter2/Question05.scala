package com.rom.chapter2

object Question05 extends App {
  def countdown(n: Int) {
    var counter = n
    while (counter >= 0) {
      println(counter)
      counter -= 1
    }
  }

  countdown(5)
}
