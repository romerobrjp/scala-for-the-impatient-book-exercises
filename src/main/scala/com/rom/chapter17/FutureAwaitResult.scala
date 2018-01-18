package com.rom.chapter17

import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

object FutureAwaitResult extends App {
  val f = Future {
    Thread.sleep(500)
    1 + 1
  }

  // this is blocking (blocking is bad)
  val duration: Duration = Duration(1, SECONDS)
  val result = Await.result(f, duration)
  println(result)
  Thread.sleep(1000)
}
