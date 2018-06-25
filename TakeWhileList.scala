object TakeWhileList{
  def main(args:Array[String]){
    val num=List.range(0,10)
    val n=num.takeWhile(a=>a<7)
    println("Number in the list less than 7: "+n)
  }
}
