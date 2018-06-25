object ListName{
  def main(args:Array[String]){
    val names=List("Bob","Will","Biss","Joe","Ben","Julia","Dun","Green")
    for(name<-names if name.startsWith("B"))
      println(name)
  }
}  
