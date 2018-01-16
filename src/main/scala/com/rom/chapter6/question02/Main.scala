package com.rom.chapter6.question02

object Main {
  def main(args: Array[String]): Unit = {
    val inchesConverter: UnitConversion = InchesToCentimeters
    val gallonsConverter: UnitConversion = GallonsToLiters
    val milesConverter:UnitConversion = MilesToKilometers

    println(inchesConverter.doConversion(5.0))
    println(gallonsConverter.doConversion(5.0))
    println(milesConverter.doConversion(5.0))
  }
}