package com.rom.chapter6.question02

//2. The preceding problem wasn’t very object-oriented. Provide a general
//super-class UnitConversion and deﬁne objects  InchesToCentimeters, GallonsToLiters,
//and MilesToKilometers that extend it.
abstract class UnitConversion {
  val INCHE_IN_CENTIMETER = 2.45
  val GALLON_IN_LITER = 3.78541
  val MILE_IN_KM = 1.60934

  def doConversion(v: Double): Double
}