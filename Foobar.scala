object Main{
  def main(args:Array[String]){
    println("Input your number:")
    var n=scala.io.StdIn.readInt()
    if(n%15==0){
      print("Foobar")
    }
    else if(n%5==0){
      print("Foo")
    }
    else if(n%3==0){
      print("Bar")
    }
    else{
      print(n)
    }
  }
}
