object MatrixSum{
  def main(args:Array[String]){
    var a=Array.ofDim[Int](2,2)
    var b=Array.ofDim[Int](2,2)
    var c=Array.ofDim[Int](2,2)
    println("Input first matrix:")
    for(i<-0 to 2){
      for(j<-0 to 2){
        a(i)(j)=scala.io.StdIn.readInt()
      }
    }
    println("Input second matrix:")
    for(i<-0 to 2){
      for(j<-0 to 2){
        b(i)(j)=scala.io.StdIn.readInt()
      }
    }
    println("Matrix addition:")
    for(i<-0 to 2){
      for(j<-0 to 2){
        c(i)(j)=a(i)(j)+b(i)(j)
        println(c(i)(j)+"\t")
      }
      println("\n")
    }
  }
}
