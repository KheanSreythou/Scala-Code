import util.control.Breaks._
object Square{
  def main(args:Array[String]):Unit={
    println("Input first number:")
    val num1=scala.io.StdIn.readInt()
    println("Input second number:")
    val num2=scala.io.StdIn.readInt()
    println("Square of "+num1+" is "+squ(num1))
    println("Square of "+num2+" is "+squ(num2))
    println("Sum of "+squ(num1)+" and "+squ(num2)+" is "+sum(squ(num1),squ(num2)))
    println("Input number to guess output:")
    val num=scala.io.StdIn.readInt()
    guess(num)
  }
  def squ(n:Int):Int={
    val s:Int=n*n; return s:Int
  }
  def sum(s1:Int,s2:Int):Int={
    val add:Int=s1+s2; return add:Int
  }
  def guess(num:Int):Unit={
    val square:Int=squ(num)
    var a:Int=0; var b:Int=0
    for(i <-0 to 10){
      var c:Int=10-i
      println("Guess output "+c+" time:")
      a=scala.io.StdIn.readInt()
      if(square==a){
        println("You are so genius.")
        break
      }
      else{
        b=square-a
        println(b+" again!")
      }
    }
    println("Sorry, the output is "+square)
  }
}

