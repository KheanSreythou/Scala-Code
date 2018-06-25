object OddListDemo{
  def main(args:Array[String]){
    var lists=List(1,32,14,7,2,45,12,89,100)
    println("List: "+lists)
    for(list<-lists if list%2!=0)
      println(list)
  }
}
