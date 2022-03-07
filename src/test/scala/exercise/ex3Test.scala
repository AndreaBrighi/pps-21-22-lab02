package exercise

import exercise.ex3.*
import org.junit.*
import org.junit.Assert.*

class ex3Test:

  @Test def testNegGenString(): Unit =
    val empty: String => Boolean = _ == ""
    val notEmpty = negGen(empty)
    assertFalse(notEmpty(""))

  @Test def testNegGenericInt(): Unit =
    val one: Int => Boolean = _ == 1
    val notOne = negGen(one)
    assertTrue(notOne(2))