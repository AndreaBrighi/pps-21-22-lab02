package exercise

import exercise.ex2.*
import org.junit.*
import org.junit.Assert.*

class ex2Test:

  val empty: String => Boolean = _ == ""

  @Test def testNegDefTrue(): Unit =
    val notEmpty = negDef(empty)
    assertTrue(notEmpty("foo"))

  @Test def testNegDefFalse(): Unit =
    val notEmpty = negDef(empty)
    assertFalse(notEmpty(""))

  @Test def testNegDefComprehensive(): Unit =
    val notEmpty = negDef(empty)
    assertTrue(notEmpty("foo") && !notEmpty(""))


  @Test def testNegValTrue(): Unit =
    val notEmpty = negVal(empty)
    assertTrue(notEmpty("foo"))

  @Test def testNegValFalse(): Unit =
    val notEmpty = negVal(empty)
    assertFalse(notEmpty(""))

  @Test def testNegValComprehensive(): Unit =
    val notEmpty = negVal(empty)
    assertTrue(notEmpty("foo") && !notEmpty(""))