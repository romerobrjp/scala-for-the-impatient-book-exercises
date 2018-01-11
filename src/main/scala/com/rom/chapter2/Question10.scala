package com.rom.chapter2

import scala.math.pow

//Write a function that computes xn, where n is an integer. Use the following
//recursive definition:
//• xn = y · y if n is even and positive, where y = xn / 2.
//• xn = x · xn – 1 if n is odd and positive.
//• x0 = 1.
//• xn = 1 / x–n if n is negative.
//Don’t use a return statement.
object Question10 extends App {
  def powit(x: Double, n: Int): Double = {
    var result: Double = 1

    if (n % 2 == 0 && n > 0) {
      val y = pow(x, n/2)
      result = y * y
    }
    else if (n % 2 == 1 && n > 0) {
      result = x * pow(x, n-1)
    }
    else if (n < 0) {
      1 / pow(x, n * -1)
    }

    result
  }

// n is even and positive
  println(powit(2, 4))

// n is odd and positive
  println(powit(2, 3))

//  n is zero
  println(powit(2, 0))

//  n is negative
  println(powit(2, 5))
}
