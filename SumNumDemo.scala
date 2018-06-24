object RecursionSum {
  def main(args:Array[String]){
    println("Input positive number:")
    var num=scala.io.StdIn.readInt
    println("The sum of all 1 to "+num+" : "+sum(num))
  }
  def sum(n:Int):Int={
    if(n==1)
      return 1
    else
      return n+sum(n-1)
  }
}
