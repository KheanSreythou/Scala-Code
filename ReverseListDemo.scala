object ReverseListDemo{
  def main(args:Array[String]){
    var list1=List(25,17,12,23)
    var list2=List(44,2,6,77)
    var list=list1:::list2
    println("List1 + List2 : ")
    list.foreach{println}
    println("Reversed of the concatenate list:")
    println(list.reverse)
  }
}

