package exercise

object ex1:

  def parityDef(x: Int): String = x % 2 match
    case 0 => "even"
    case 1 => "odd"

  val parityVal: Int => String = _ % 2 match
    case 0 => "even"
    case 1 => "odd"
