import scala.util.control.Breaks._
object BreakDemo{
  def main(args:Array[String]){
    for(i<-1 to 3){
      breakable{
        for(j<-1 to 3){
          if(i==2 &j==2)
            break
          println(i+"\t"+j)
        }
      }
    }
  }
}