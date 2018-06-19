object RecSum {
  def main(args: Array[String]){
    println("Input first number: ")
    var num1=scala.io.StdIn.readInt
    println("Input second number: ")
    var num2=scala.io.StdIn.readInt
    println("Sum of "+num1+" to "+num2+ " is " +sum(num1,num2))
  }
  def sum(n1:Int,n2: Int){
    var add:Int=0
     if(add>n2){
       add=add+n1
     }
     else{
       return 1
     }
  }
}