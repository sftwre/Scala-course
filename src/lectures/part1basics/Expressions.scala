package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // expression
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>>
  println(1 == x)

  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ... side effects
  println(aVariable)

  // instructions vs expressions
  // imperitave languages always work with expressions, they tell the computer what to do
  // expressions compute values

  val aCond = true
  val aCondValue = if(aCond) 5 else 3 // if expression
  println(aCondValue)

  // looping is specific to imperitave languages
  // EVERYTHING in scala is an expression !
  val aWeirdValue = (aVariable = 3) // unit === void
  println(aWeirdValue)

  // side effects in scala are expressions returning unit
  // side effects: println, whiles, reassingning

  // code blocks, they are expressions like everything else in scala
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "goodbye"
  }
  // value of the block is the value of it's last expression

  // instructions are executed, expressoins are evaluated

}
