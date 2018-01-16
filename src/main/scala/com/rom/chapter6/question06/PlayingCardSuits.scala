package com.rom.chapter6.question06

object PlayingCardSuits extends Enumeration {
  type PlayingCardSuits = Value
  val Hearts = Value("\u2665")
  val Diamonds = Value("\u2666")
  val Clubs = Value("\u2663")
  val Pikes = Value("\u2660")

  override def toString(): String = {
    PlayingCardSuits.values.mkString("|")
  }
}
