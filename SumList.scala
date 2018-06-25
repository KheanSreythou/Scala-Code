object SumList{
  def main(args:Array[String]){
    val number=List.range(1,10)
    var sum=0
    number.foreach(sum+=_)
    println("Sum of the number in the list: "+sum)
  }
}
