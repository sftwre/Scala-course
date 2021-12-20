package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)
      result
    }
  }


  //  print(factorial(10))


  def anotherFactorial(n: Int): BigInt = {

    // This implementation allows scala to preserve the current stack frame
    // and not use new stack frames
    // annotation tells the compiler that the function is supposed to be tail recursive. If that's not the case, the
    // compiler will issue a warning
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
    // you need one accumutlator per recursive call
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // Tail recursion = use a recursive call as the last expression

    factHelper(n, 1)
  }

//  print(anotherFactorial(5))

  // When you need loops, use Tail recursion

  @tailrec
  def concatStr(s: String, n: Int, accumulator: String): String = {
    if (n <= 0) accumulator
    else concatStr(s, n-1, s + accumulator)
  }

  println(concatStr("Hello", 4, ""))


  def isPrime(n:Int): Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t-1, n % t != 0 && isStillPrime)
    }

    isPrimeTailrec(n / 2, true)
  }

  println(isPrime(2003))
  println(isPrime(4))


  /*
  * 1. concat string n times
  * 2. IsPrime function tail recursive
  * 3. Fibonacci function, tail recursive
  * */

  // you need as many accumalators as recursive calls

  def fibonacci(n: Int): Int = {
    def fibHelper(i: Int, last: Int, nextToLast: Int): Int = {
      if (i >= n) last
      else fibHelper(i + 1, last + nextToLast, last)
    }

    if (n <= 2) 1
    else fibHelper(2, 1, 1)
  }

  println(fibonacci(8))

}


