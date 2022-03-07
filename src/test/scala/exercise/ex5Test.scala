package exercise

import exercise.ex5.*
import org.junit.*
import org.junit.Assert.*

import scala.collection.immutable.Range

class ex5Test:

  @Test def testComposeVal(): Unit =
    assertEquals(9, composeVal(_ - 1, _ * 2)(5))

  @Test def testComposeDef(): Unit =
    assertEquals(9, composeDef(_ - 1, _ * 2)(5))

  @Test def testComposeGen(): Unit =
    val f1: Int => Double = _ / 2
    val f2: Double => Boolean = _ == 0
    assertFalse(composeGen(f2, f1)(5))

