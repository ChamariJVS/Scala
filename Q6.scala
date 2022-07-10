
import scala.io.StdIn.readInt;

object Demo {

    def profit( ticketPrice: Int, attendance: Int) : Int = { 
         return (attendance*ticketPrice) - ( 500 + 3*attendance);
    };
    
    def main(args: Array[String]) :Unit={ 

        var change_Price = 5;
        var change_Attendance = 20;

        print("Enter the normal ticket price:");
        val ticketPrice : Int = scala.io.StdIn.readInt();
        print("Enter the attendance:");
        val attendence : Int = scala.io.StdIn.readInt();

        var p1 = profit(ticketPrice, attendence); 
        var p2= profit(ticketPrice+change_Price,attendence -change_Attendance);
        var p3= profit(ticketPrice-change_Price, attendence +change_Attendance);

        var best_profit = if ( p1>p2 && p1>p3) p1 else if ( p2>p1 && p2>p3 ) p2 else p3;

        if( best_profit ==p1 )
            println("The best ticket price is Rs:"+ ticketPrice + "\n\n");
        else if ( best_profit ==p2)
            println("The best ticket price is Rs:"+ (ticketPrice + change_Price)+ "\n\n");
        else
            println("The best ticket price is Rs:"+ (ticketPrice - change_Price) + "\n\n" );
        
        
    }

}   

    