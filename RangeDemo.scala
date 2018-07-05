object RangeDemo{
  def main(args:Array[String]){
    var myNumArray=List.range(1,10)
    var myStringArray1=List.range('A','Z')
    var myStringArray2=List.range('a','z')
    for(i<-myNumArray){
      print(i+" ")
    }
    println()
    for(i<-myStringArray1){
      print(i+" ")
    }
    println()
    for(i<-myStringArray2){
      print(i+" ")
    }
  }
}
