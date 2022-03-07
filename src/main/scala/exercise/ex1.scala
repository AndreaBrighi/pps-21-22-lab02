package exercise

object ex1:

  def parityDef(x: Int): String = x match
    case n if n % 2 == 0 => "even"
    case n if n % 2 == 1 => "odd"

  val parityVal: Int => String = _ match
    case n if n % 2 == 0 => "even"
    case n if n % 2 == 1 => "odd"
