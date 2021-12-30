package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b:Int): String =
    {
      a + " " + b
    }

  println(aFunction("hello", 3))

  def aParameterlessFunction():Int = 42

  // paramerless functions can be called with just their name
  println(aParameterlessFunction())
  println(aParameterlessFunction)


  def aRepeatedFunction(aString:String, n:Int): String = {
    if(n == 1) aString
    else aString  + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n:Int):Int = {
    def aSmallFunction(a:Int, b:Int):Int = a+b
    aSmallFunction(n, n-1)
  }

  def myFunc(name:String):String = {
    "Hello " + name
  }


  /**
   * 1. Greeting function (name, age)
   * 2. Factorial function 1 * 2 * 3 * .. * 11
   * 3. Fibonacci function
   *  f(1) = 1
   *  f(2) = 1
   *  f(n) = f(n-1) + f(n-2)
   * 4. Test if number is prime
   */

  def greeting(name:String, age:Int):String = { s"Hi my name is $name and I am $age years old" }

  def factorial(n:Int):Int = {
    if (n == 1) n
    else n * factorial(n-1)
  }

  def fib(n:Int):Int = {
    if(n == 0 || n == 1) n
    else fib(n-1) + fib(n-2)
  }

  def isPrime(n:Int):Boolean = {

    def isPrimeUntil(t:Int): Boolean =
      if(t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n /2)
  }

  println(greeting("Isaac", 22))
  println(factorial(3))
  println(fib(8))

  println(isPrime(37))
  println(isPrime(2003))

  // compiler infers return type and variable type
  def succ(x:Int) = x + 1

}
