package exercise

import org.junit.Assert.assertEquals
import org.junit.Test
import u02.Optionals.Option.{None, Some, filter, map, map2}

class ex8Test:

  @Test def testFilterSome(): Unit =
    assertEquals(Some(5), filter(Some(5))(_ > 2))

  @Test def testFilterNone(): Unit =
    assertEquals(None(), filter(Some(5))(_ > 8))

  @Test def testFilterWithNone(): Unit =
    assertEquals(None(), filter(None[Int]())(_ > 2))

  @Test def testMapSomeTrue(): Unit =
    assertEquals(Some(true), map(Some(5))(_ > 2))

  @Test def testMapNoneFalse(): Unit =
    assertEquals(Some(false), map(Some(5))(_ > 8))

  @Test def testMapWithNone(): Unit =
    assertEquals(None(), filter(None[Int]())(_ > 2))

  @Test def testMap2SomeTrue(): Unit =
    assertEquals(Some(8), map2(Some(5))(Some(3))((a, b) => a + b))

  @Test def testMap2NoneFalse(): Unit =
    assertEquals(None(), map2(Some(5))(None[Int]())((a, b) => a + b))

  @Test def testMap2WithNone(): Unit =
    assertEquals(None(), map2(None[Int]())(None[Int]())((a, b) => a + b))


