object OddListDemo{
  def main(args:Array[String]){
    var list1=List(1,2,3,4,5,6)
    var list2=List(7,8,9,1,2,5)
    var list=list1:::list2
    println("List:")
    list.foreach{println}
    println("List exception the last:")
    println(list.init)
    
  }
}
