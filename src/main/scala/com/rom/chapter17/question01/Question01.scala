package com.rom.chapter17.question01

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

//1. Consider the expression
//  for (n1 <- Future { Thread.sleep(1000) ; 2 }
//  n2 <- Future { Thread.sleep(1000); 40 })
//  println(n1 + n2)
//
//  How is the expression translated to map and flatMap calls? Are the two futures
//  executed concurrently or one after the other? In which thread does the call
//  to println occur?
object Question01 extends App {
  // The futures are executed one after the other
  println("The futures are executed one after the other: ")
  for (n1 <- Future { Thread.sleep(1000); 2 }; n2 <- Future { Thread.sleep(1000); 40 }) {
    println(s"n1: $n1")
    println(s"n2: $n2")
    println(s"n1 + n2 = ${n1 + n2}")
  }

  Thread.sleep(2100)

  // This way solves the problem but isn't so good
  println("\n\nThis way solves the problem but isn't so good:")
  val f1 = Future { Thread.sleep(1000); 7 }
  val f2 = Future { Thread.sleep(1000); 35 }
  val resultf = f1.map(n1 => f2.map(n2 => n1 + n2))
  Thread.sleep(2100)
  resultf.foreach(println)

  Thread.sleep(2100)

  // Nicer than the first solution but still not so good
  println("\n\nNicer than the first solution but still not so good")
  val ff1 = Future { Thread.sleep(1000); 15 }
  val ff2 = Future { Thread.sleep(1000); 27 }
  val resultff = ff1.flatMap(n1 => ff2.map(n2 => n1 + n2))
  resultff.foreach(println)

  Thread.sleep(2100)

  // Nicer and recommended way
  println("\n\nNICER AND RECOMMENDED WAY: ")
  val fff1 = Future { Thread.sleep(1000); 26}
  val fff2 = Future { Thread.sleep(1000); 16}
  val resultfff = for (n1 <- fff1; n2 <- fff2) yield n1 + n2
  resultfff.foreach(println)

  Thread.sleep(2100)
}
