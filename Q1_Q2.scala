object Demo {
   def main(args: Array[String]) :Unit={
    //1
      val k,i,j= 2;
      val m,n = 5;
      val (f,g) = (12.0f, 4.0f);
      val c = 'X';
      
    //2
      println( "k + 12 * m	:" + (k + 12 * m));
      println( "m / j	      :" + (m / j));
      println( "n % j	      :" + (n % j));
      println( "m / j * j	  :" + (m / j * j));
      println( "f + 10*5 +g	:" + (f + 10*5 +g));
      println( "++i * n	    :" + ((i+1) * n));
  
  
  }
}