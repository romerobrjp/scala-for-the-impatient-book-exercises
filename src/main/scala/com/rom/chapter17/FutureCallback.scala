package com.rom.chapter17

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}
import scala.util.Random

object FutureCallback extends App {
  val f = Future {
    val i: Int = Random.nextInt(500)
    Thread.sleep(i)
    i
  }
  println("Before complete")

  f.onComplete {
    case Success(v) => println(s"The Thread.sleep time was of $v")
    case Failure(ex) => println(ex.getMessage)
  }

  println("B ..."); Thread.sleep(50)
  println("A ..."); Thread.sleep(50)
  println("C ..."); Thread.sleep(50)
  println("D ..."); Thread.sleep(50)
  println("E ..."); Thread.sleep(50)
  println("F ..."); Thread.sleep(50)
  Thread.sleep(2000)
}
