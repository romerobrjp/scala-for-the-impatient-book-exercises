package com.rom.chapter6.question02

object GallonsToLiters extends UnitConversion {
  override def doConversion(v: Double): Double = {
    v * GALLON_IN_LITER
  }
}