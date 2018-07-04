object ArrayMaxMin{
  def main(args:Array[String]){
    var arr=new Array[Int](5)
    println("Input number in array:")
    for(i <-0 to arr.length-1){
      arr(i)=scala.io.StdIn.readInt()
    }
    var f=(x:Int,y:Int)=> x max y
    var e=(x:Int,y:Int)=> x min y
    println("Max in array: "+arr.reduceLeft(f))
    println("Min in array: "+arr.reduceLeft(e))
  }
}
