object FactorialDemo {
  def main(args:Array[String]){
    println("Input positive number:")
    var num=scala.io.StdIn.readInt()
    println("The factorial of "+num+" : "+fac(num))
  }
  def fac(number:Int):Int={
    if(number==1)
      return 1
    else
      return number*fac(number-1)
  }
}