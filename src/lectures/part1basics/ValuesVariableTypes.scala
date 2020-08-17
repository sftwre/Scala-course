package lectures.part1basics

object ValuesVariableTypes extends App {
  val x : Int = 42
  println(x)

  // vals are immutable

  // compiler can infer types

  val aString: String = "hello"
  val anotherString = "sdfsf"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 5273985273895237L
  val aFloat: Float = 2.09f
  val aDouble: Double = 3.4

  // variables
  var aVariable: Int = 4
  aVariable = 5 // side effects, useful because they allow us to see what are programs are doing

  // prefer vals over vars
}
