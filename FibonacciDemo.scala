object FibonacciDemo {
  def main(args:Array[String]){
    println("Input number:")
    var num=scala.io.StdIn.readInt
    println("Fibonacci of "+num+" : ")
    print(fibo(num))
  }
  def fibo(n:Int){
    var temp:Int=0; var a:Int=0
    var b:Int=1
    print(a+"\t")
    print(b)
    while(b<n){
      temp=a+b
      a=b
      b=temp
      print("\t"+b)
    }
  }
}