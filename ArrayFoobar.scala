object ArrayFoobar{
  def main(args:Array[String]){
    var num=Range(1,101)
    for(i<-num){
      if(i%15==0)
        println("Foobar")
      else if(i%5==0)
        println("Bar")
      else if(i%3==0)
        println("Foo")
      else
        println(i)
    }
  }
}
