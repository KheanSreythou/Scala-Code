object YesNoList{
  def main(args:Array[String]){
    val name=List("Alex","Aloha","Hola","Bob")
    var names=name.takeWhile(a=>a=4)
    println("Yes")
    var names=name.takeWhile(a=>a!4)
    println("No")
  }
}
