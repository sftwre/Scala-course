package lectures.part1basics

object CBNvsCBV extends App {

  def callByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)

  }

  /*
  Delays evaluation until value is used in function call.
  This is useful in lazy streams and things that can fail.
   */
  def callByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  printFirst(34, infinite())

}
