package com.rom.chapter6

//5. Write a Scala application, using the App trait, that prints its command-line
//arguments in reverse order, separated by spaces. For example, scala Reverse
//Hello World should print World Hello.
object Question05 extends App {
  if (args.length == 0) print("No argument")
  else if (args.length > 0) print(args.reverse.mkString(" "))
}