package exercise

import exercise.ex7.Shape.area
import exercise.ex7.Shape.perimeter
import exercise.ex7.Shape.Square
import exercise.ex7.Shape.Circle
import exercise.ex7.Shape.Rectangle
import org.junit.Assert.assertEquals
import org.junit.Test

class ex7Test:
  @Test def testCircleArea(): Unit =
    assertEquals(3 * 3 * 3.14, area(Circle(3)), 0.5)

  @Test def testCirclePerimeter(): Unit =
    assertEquals(2 * 3 * 3.14, perimeter(Circle(3)), 0.5)

  @Test def testSquareArea(): Unit =
    assertEquals(3 * 3, area(Square(3)), 0.5)

  @Test def testSquarePerimeter(): Unit =
    assertEquals(4 * 3, perimeter(Square(3)), 0.5)

  @Test def testRectangleArea(): Unit =
    assertEquals(3 * 4, area(Rectangle(3, 4)), 0.5)

  @Test def testRectanglePerimeter(): Unit =
    assertEquals(2 * (4 + 3), perimeter(Rectangle(3, 4)), 0.5)
