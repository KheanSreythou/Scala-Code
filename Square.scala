object Square{
  def main(args:Array[String]):Unit={
    println("Input number:")
    val num=scala.io.StdIn.readInt()
    println("Square of "+num+" is "+squ(num)
  )}
  def squ(n:Int):Int={
    val s:Int=n*n; return s:Int
  }
}
