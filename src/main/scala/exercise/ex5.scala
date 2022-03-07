package exercise

object ex5:
  val composeVal: (Int => Int, Int => Int) => Int => Int = (f: Int => Int, g: Int => Int) => i => f(g(i))

  def composeDef(f: Int => Int, g: Int => Int): Int => Int = i => f(g(i))

  def composeGen[A, B, C](f: C => B, g: A => C): A => B = i => f(g(i))
