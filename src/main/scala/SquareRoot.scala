import scala.annotation.tailrec
import scala.math.sqrt

/* class squareRoot contains all methods which is requre to calculate square root */
class SquareRoot {
  def squareRootOfList(number: List[Double]): List[Double] = {

    // throwing exception if list is empty
    if (number.isEmpty) throw new NullPointerException("Exception Empty list")
    else {
      @tailrec
      def helper(num1: List[Double], accum: List[Double]): List[Double] = num1 match {
        case Nil => accum.reverse
        case first :: result => if (first < 0) throw new IllegalArgumentException("Can't get square root of negative")
        else helper(result, sqrt(first) :: accum)
      }

      helper(number, Nil)
    }
  }
}

