package exercise

import exercise.ex4.*
import org.junit.*
import org.junit.Assert.*

import scala.collection.immutable.Range

class ex4Test:

  @Test def testP1True(): Unit =
    assertTrue(p1(1)(2)(3))

  @Test def testP1False(): Unit =
    assertFalse(p1(3)(2)(3))

  @Test def testP2True(): Unit =
    assertTrue(p2(1, 2, 3))

  @Test def testP2False(): Unit =
    assertFalse(p2(3, 2, 3))

  @Test def testP3True(): Unit =
    assertTrue(p3(1)(2)(3))

  @Test def testP3False(): Unit =
    assertFalse(p3(3)(2)(3))

  @Test def testP4True(): Unit =
    assertTrue(p4(1, 2, 3))

  @Test def testP4False(): Unit =
    assertFalse(p4(3, 2, 3))

