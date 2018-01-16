package com.rom.chapter6.question02

object InchesToCentimeters extends UnitConversion {
  override def doConversion(v: Double): Double = {
    v * INCHE_IN_CENTIMETER
  }
}