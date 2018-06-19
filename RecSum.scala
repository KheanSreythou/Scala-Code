object RecSum {
  def main(args: Array[String]){
    for(i<-10 to 1)
      print(sum(i))
  }
  def sum(n:Int):Int={
    if(n==1)
      return
    else
      n+sum(n-1)
  }
}