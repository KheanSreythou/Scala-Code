object ArraySum{
  def main(args:Array[String]){
    var sum:Int=0
    var arr=new Array[Int](5)
    println("Input number:")
    for(i<-0 to arr.length-1){
    arr(i)=scala.io.StdIn.readInt()
    }
    for(i<-0 to arr.length-1){
      sum+=arr(i)
    }
    println("Sum in the array: "+sum)
  }
}
