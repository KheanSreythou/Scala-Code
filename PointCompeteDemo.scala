object PointCompeteDemo {
  def main(args:Array[String]){
    println("Subjects: DBMS, Scala, Java, English, NetworkSecurit")
    println("Input 5 subjects marks for first student:")
    var dbms1=scala.io.StdIn.readInt
    var scala1=scala.io.StdIn.readInt
    var java1=scala.io.StdIn.readInt
    var english1=scala.io.StdIn.readInt
    var network1=scala.io.StdIn.readInt
    println("Input 5 subjects marks for second student:")
    var dbms2=scala.io.StdIn.readInt
    var scala2=scala.io.StdIn.readInt
    var java2=scala.io.StdIn.readInt
    var english2=scala.io.StdIn.readInt
    var network2=scala.io.StdIn.readInt
    if(dbms1!=dbms2){
      print("1\t")
    }
      
    if(scala1!=scala2){
      print("1\t")
    }
    if(java1!=java2){
      print("1\t")
    }
    if(english1!=english2){
      print("1\t")
    }
    if(network1!=network2){
      print("1\t")
    }
  }
}