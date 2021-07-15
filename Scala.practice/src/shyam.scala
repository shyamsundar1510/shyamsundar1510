import java.io.FileInputStream

object shyam {
  def main (args:Array[String])=
  {
    
    val a=10
    val b=12
    val c=a+b
    println(c)
    
    def add(a:Int,b:Int)={a+b}
    
    val cx=add(2,3)
    println(cx)
    
    class division {
      def data(a:Int,b:Int)=a/b
    }
    
    val sss=new division
    val date=sss.data(10, 5)
    println("Today" +date)
}
}
