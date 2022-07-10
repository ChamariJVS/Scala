object Demo {
   def main(args: Array[String]) :Unit={
    var a : Int = 2;
    var b : Int = 3;
    var c : Int = 4;
    var d : Int = 5;
    var k : Float = 4.3f;

    //println(--b*a+c*d--);
    b =b- 1;
    println(b*a+c*d);
    d =d-1;
  
    //println(a++);
    print(a);
    a =a+1;

    val g=0;
    //println(-2*(g-k)+c);
    println(-2*(g-k)+c);

    //println(c=c++);
    println(c);

    //println(c=++c*a++);
    c =c+  1;
    println(c*a);
    a =a+1;
      
      
  }
}