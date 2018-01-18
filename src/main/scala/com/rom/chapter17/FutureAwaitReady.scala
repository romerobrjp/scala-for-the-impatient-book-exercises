package com.rom.chapter17

import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

object FutureAwaitReady extends App {
  val f = Future {
    Thread.sleep(500)
    2 + 3
  }

  // this is blocking (blocking is bad)
  Await.ready(f, 2.seconds)
  val Some(t) = f.value
  if (t.isSuccess) print(t)
  else if (t.isFailure) print("Something wrong happened!")

}
