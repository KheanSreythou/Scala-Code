object SumNumber {
  def main(args: Array[String]){
    println("Input first number:")
    var num1=scala.io.StdIn.readInt
    println("Input second number:")
    var num2=scala.io.StdIn.readInt
    println("Sum of "+num1+" and "+num2+" is "+sum(num1,num2))
  }
  def sum(a:Int,b:Int):Int={
    var add:Int=a+b
    return add:Int
  }
}