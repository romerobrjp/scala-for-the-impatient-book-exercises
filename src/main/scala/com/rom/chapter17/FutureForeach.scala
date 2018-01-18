package com.rom.chapter17

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object FutureForeach extends App {
  def future1 = Future { Thread.sleep(1000) ; 3 }
  def future2 = Future { Thread.sleep(1000); 7 }
  val result = for (n1 <- future1; n2 <- future2) yield n1 + n2
  result.foreach(println)

  Thread.sleep(2500)
}
