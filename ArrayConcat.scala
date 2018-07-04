object ArrayConcat{
  def main(args:Array[String]){
    var arr1=new Array[Int](5)
    var arr2=new Array[Int](5)
    println("Input 5 numbers for array1:")
    for(i<-0 to arr1.length-1){
      arr1(i)=scala.io.StdIn.readInt()
    }
    println("Input 5 numbers for array2:")
    for(i<-0 to arr2.length-1){
      arr2(i)=scala.io.StdIn.readInt()
    }
    var arr=arr1++arr2
    println("Concatenate of array1 and array2:")
    for(i<-0 to arr.length-1){
      print(arr(i)+"\t")
    }
  }
}
