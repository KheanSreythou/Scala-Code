object ListDemo3{
  def main(args:Array[String]){
    var x=List.range(1,10)
    var y=List.range(0,10,2)
    var z=List.fill(3)("foo")
    var t=List.tabulate(5)(n=>n*n)
    println("Range Method: "+x)
    println("Range Method: "+y)
    println("File Method: "+z)
    println("Tabulate Method: "+t)
  }
}
