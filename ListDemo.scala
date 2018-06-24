object ListDemo{
  def main(args:Array[String]){
    var fruits=List("Apple","Banana","Coconut","Dragon Fruit","Cherry","Avocado")
    var t=fruits.tail
    var h=fruits.head
    var a="Kiwi"::fruits
    var x=fruits.slice(3,5)
    
    println("List of fruits: "+fruits)
    println("Head of fruits: "+h)
    println("Tail of fruits: "+t)
    println("Add of fruits: "+a)
    println("Slice of fruits(3,5): "+x)
    println("Check if fruit is Empty: "+fruits.isEmpty)
  }
}

