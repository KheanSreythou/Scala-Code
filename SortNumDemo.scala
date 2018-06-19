object SortNumDemo {
  def main(args:Array[String]){
    println("Input first number:")
    var a=scala.io.StdIn.readInt
    println("Input second number:")
    var b=scala.io.StdIn.readInt
    println("Input third number:")
    var c=scala.io.StdIn.readInt
    println("Sort these three numbers: ")
    println(sort(a,b,c))
  }
  def sort(n1:Int,n2:Int,n3:Int){
    if(n1>n2)
      if(n1>n3)
        if(n2>n3)
          println(n1+"\t"+n2+"\t"+n3)
        else
          println(n1+"\t"+n3+"\t"+n2)
      else
        println(n3+"\t"+n1+"\t"+n2)
    else if(n2>n1)
      if(n2>n3)
        if(n1>n3)
          println(n2+"\t"+n1+"\t"+n3)
        else
          println(n2+"\t"+n3+"\t"+n1)
      else
        println(n3+"\t"+n2+"\t"+n1)
    else if(n1==n2)
      if(n1>n3)
          println(n2+"\t"+n1+"\t"+n3)
        else
          println(n3+"\t"+n2+"\t"+n1)
    else if(n2==n3)
      if(n1>n2)
          println(n1+"\t"+n2+"\t"+n3)
        else
          println(n3+"\t"+n2+"\t"+n1)
    else
      println(n1+"\t"+n2+"\t"+n3)
  }
}