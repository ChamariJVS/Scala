import scala.io.StdIn.readInt;
object Demo {
  def normalHour(x:Int) : Int ={
    return x*150;
    } 

    def ot(x:Int) : Int ={
      return x*75;
      } 

    def tax(x:Int, y:Int) : Double = {
        return (normalHour(x) + ot(y))*0.1;
    }

    def salary(normalH: Int, otH: Int) : Double = {
        return normalHour(normalH) + ot(otH) - tax(normalH, otH);
    } 

    def main(args: Array[String]) :Unit={
      print("The number of working hours :");
      var a:Int = readInt();
      print("The number of OT hours :");   
      var b:Int  =readInt();
      

      printf("Take Home Salary :%f", salary(a, b));
      
  }
}