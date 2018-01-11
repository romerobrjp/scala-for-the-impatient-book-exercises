package com.rom.chapter2

//  Write a Scala equivalent for the Java loop
//    for (int i = 10; i >= 0; i--) System.out.println(i);
object Question04 extends App {
  for (i <- 10 to 1 by -1) {
    println(i)
  }
}
