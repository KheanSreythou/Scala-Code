object CountDown{
  def main(args:Array[String]){
    println("Input number:")
    var num=scala.io.StdIn.readInt()
    while(num!=0){
      println(num)
      num=num-1
    }
    println("0")
    println("Happy Birthday")
  }
}
