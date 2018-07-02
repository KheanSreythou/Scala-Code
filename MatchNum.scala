object MatchNum{
  def main(args:Array[String]){
    println("Input a number:")
    var n=scala.io.StdIn.readInt()
    n match{
      case 0 => println("Zero")
      case 1 => println("One")
      case 2 => println("Two")
      case 3 => println("Three")
      case 4 => println("Four")
      case 5 => println("Five")
      case 6 => println("Six")
      case 7 => println("Seven")
      case 8 => println("Eight")
      case 9 => println("Nine")
      case _ => println("0_0")
    }
  }
}
