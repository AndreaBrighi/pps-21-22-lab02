package exercise

import exercise.ex6.{fib, fibTail}
import org.junit.Assert.assertEquals
import org.junit.Test


class ex6Test:
  @Test def testFib1(): Unit =
    assertEquals(1, fib(1))

  @Test def testFib2(): Unit =
    assertEquals(1, fib(2))

  @Test def testFib0(): Unit =
    assertEquals(0, fib(0))

  @Test def testFib3(): Unit =
    assertEquals(2, fib(3))

  @Test def testFib4(): Unit =
    assertEquals(3, fib(4))

  @Test def testFibTail1(): Unit =
    assertEquals(1, fibTail(1))

  @Test def testFibTail2(): Unit =
    assertEquals(1, fibTail(2))

  @Test def testFibTail0(): Unit =
    assertEquals(0, fibTail(0))

  @Test def testFibTail3(): Unit =
    assertEquals(2, fibTail(3))

  @Test def testFibTail4(): Unit =
    assertEquals(3, fibTail(4))
