package com.rom.chapter6.question02

object MilesToKilometers extends UnitConversion {
  override def doConversion(v: Double): Double = {
    v * MILE_IN_KM
  }
}