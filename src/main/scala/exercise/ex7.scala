package exercise

object ex7:

  enum Shape:
    case Rectangle(w: Double, h: Double)
    case Circle(r: Double)
    case Square(l: Double)

  object Shape:

    def perimeter(shape: Shape): Double = shape match
      case Circle(r) => r * 2 * Math.PI
      case Square(l) => l * 4
      case Rectangle(w, h) => (w + h) * 2


    def area(shape: Shape): Double = shape match
      case Circle(r) => r * r * Math.PI
      case Square(l) => l * l
      case Rectangle(w, h) => w * h