import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers.{an, be}

class SquareRootTest extends AnyFlatSpec {
  val objOfSquareRoot = new SquareRoot()
  it should "check weather actual output is equal to expected output" in {
    assert(objOfSquareRoot.squareRootOfList(List(4, 16, 25, 36)) == List(2.00, 4.00, 5.00, 6.00))
  }
  it should "throw an Exception if list is empty" in {
    an[NullPointerException] should be thrownBy {
      objOfSquareRoot.squareRootOfList(List())
    }
  }
  it should "throw an Exception if list contains negative value" in {
    an[IllegalArgumentException] should be thrownBy {
      objOfSquareRoot.squareRootOfList(List(-1))
    }
  }
  it should "check weather actual output is equal to expected provided output" in {
    assert(objOfSquareRoot.squareRootOfList(List(100, 400, 1600, 225, 625)) == List(10.00, 20.00, 40.00, 15.00, 25.00))
  }
  it should "check weather actual output is equal to provided output" in {
    assert(objOfSquareRoot.squareRootOfList(List(10, 20, 30, 40, 50)) == List(3.1622776601683795, 4.47213595499958, 5.477225575051661, 6.324555320336759, 7.0710678118654755)
    )
  }
}
