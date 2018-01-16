package com.rom.chapter6.question01

//1. Write an object Conversions with methods inchesToCentimeters, gallonsToLiters, and milesToKilometers.
object Conversions extends App {
  def inchesToCentimeters(inches: Double): Double = {
    inches * 2.45
  }

  def gallonsToLiters(gallons: Double): Double = {
    gallons * 3.78541
  }

  def milesToKilometers(miles: Double): Double = {
    miles * 1.60934
  }

  println(inchesToCentimeters(5.0))
  println(gallonsToLiters(5.0))
  println(milesToKilometers(5.0))
}