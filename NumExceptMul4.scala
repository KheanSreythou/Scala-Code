object NumberDemo {
  def main(args:Array[String]){
    println("Input number:")
    var num=scala.io.StdIn.readInt
    println("Output")
    for(i<-0 to num; if i%4!=0){
      println(i)
    }
  }
}
