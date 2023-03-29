object SquareRootDriver extends App {

  //object of SquareRoot class to access methods in class
  val objOfSquare = new SquareRoot

  //try block to handle exception
  try {
    val list: List[Double] = List(4, 16, 25, 36, 49)
    val ref = objOfSquare.squareRootOfList(list).map(_.toDouble)
    println(ref)
  }
  catch {
    case ex: IllegalArgumentException => println(ex.getMessage)
    case e: NullPointerException => println(e.getMessage)
  }
}
