object FilterList{
  def main(args:Array[String]){ 
    var num=List.range(1,10)
    var even=num.filter(a=>a%2==0)
    println("Number in the list: "+even)
  }
}
