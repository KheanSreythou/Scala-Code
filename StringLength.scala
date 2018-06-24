object StringLength{
  def main(args:Array[String]){
    println("Enter a sentence:")
    var str=scala.io.StdIn.readLine()
    println("Length of String: "+str.length())
  }
}

