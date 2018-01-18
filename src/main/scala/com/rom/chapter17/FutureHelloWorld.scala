package com.rom.chapter17

import java.time._
import scala.concurrent._
import scala.concurrent.ExecutionContext.Implicits.global

object FutureHelloWorld extends App {
  Future {
    Thread.sleep(1000)
    println(s"\n\nIn the future: ${LocalTime.now}")
  }
  println(s"In the present: ${LocalTime.now}\n")
  Future { for (i <- 1 to 100) { print("A"); Thread.sleep(10) } }
  Future { for (i <- 1 to 100) { print("B"); Thread.sleep(10) } }

  Thread.sleep(1100)
}
