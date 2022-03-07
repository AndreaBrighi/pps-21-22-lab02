package exercise

import exercise.ex1.*
import org.junit.*
import org.junit.Assert.*

class ex1Test:

  val empty: String => Boolean = _ == ""

  @Test def testParityValEven(): Unit =
    assertEquals("even", parityVal(2))

  @Test def testParityValOdd(): Unit =
    assertEquals("odd", parityVal(3))

  @Test def testParityDefEven(): Unit =
    assertEquals("even", parityDef(2))

  @Test def testParityDefOdd(): Unit =
    assertEquals("odd", parityDef(3))