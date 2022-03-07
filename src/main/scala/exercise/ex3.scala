package exercise

object ex3:
  
  def negGen[A] (f: A => Boolean): A => Boolean = i => !f(i)
