object SortList{
  def main(args:Array[String]){
    val x=List(12,34,2,23,67,1,9,6,2)
    val y=x.sorted
    val fruits=List("Banana","coconut","Apple","orange","Avocado")
    val sort=fruits.sorted
    println("Number in the list: "+x)
    println("After sorting: "+y)
    println("Fruit in the list: "+fruits)
    println("After sorting: "+sort)
  }
}
