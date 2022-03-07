package exercise

import scala.annotation.tailrec

object ex6:

  /* no tail one recursion
      the recursion is done twice amd then summed, so the last recursion isn't return as it is
  */
  def fib(n: Int): Int = n match
    case i if i > 2 => fib(i - 1) + fib(i - 2)
    case 2 | 1 => 1
    case 0 => 0


  /*
  tail one recursion
  the value compute by the last function call is the one that is returned
  */
  def fibTail(n: Int): Int =
    @tailrec
    def _fib(n: Int, next: Int, actual: Int): Int = n match
      case i if i > 0 => _fib(n - 1, next + actual, next)
      case 0 => actual

    _fib(n, 1, 0)

