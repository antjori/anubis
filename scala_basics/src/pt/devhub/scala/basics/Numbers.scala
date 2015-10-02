package pt.devhub.scala.basics

object Numbers {

  def main(args: Array[String]) {
    val x = 2
    println(someFunction(x))
  }

  def someFunction(arg: Int): Int = {
    1 + 2 * 3 / arg
  }
}