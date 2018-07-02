object SumTuple{
  def main(args:Array[String]){
    var t=("Hello",5,10.3f,"Hey")
    var sum:Double=0.0f
    t.productIterator.foreach{i=>println("Value = "+i)}
    t.productIterator.foreach{
      case i:Int=>sum+=i.toDouble
      case f:Float=>sum+=f
      case s:String=>
    }
    println("Sum in the tuple: "+sum)
  }
}
