package com.rom.chapter4

//1. Set up a map of prices for a number of gizmos that you covet.
//Then produce a second map with the same keys and the prices at a 10 percent discount.
object Question01 extends App {
  val prices = Map("A" -> 100.00, "B" -> 30.00, "C" -> 50.00)
  val discounts = for ((k, v) <- prices) yield (k, v * 0.9)

  println(prices)
  print(discounts)
}
