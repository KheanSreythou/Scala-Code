object ListMap2{
  def main(args:Array[String]){
    val names=List("Joe","Terry","John","Bob","Ham")
    val lower=names.map(_.toLowerCase)
    val upper=names.map(_.toUpperCase)
    println("Name in the list: "+names)
    println("Convert to lower case: "+lower)
    println("Convert to upper case: "+upper)
  }
}
