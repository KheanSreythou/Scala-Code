object SumTuple{
  def main(args:Array[String]){
    var t=("Hello",5,10.3,"Hey")
    t.productIterator.foreach{i=>println("Value = "+i)}
    var sum=t._2+t._3
    println("Sum in the tuple: "+sum)
  }
}
