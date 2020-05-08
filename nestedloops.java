public class nestedloops {

    public static void main(String[] args) {

         // this is #1 - I'll call it "CN"
         for ( int n=1; n <= 3; n++ )
         
         {for ( char c='A'; c <= 'E'; c++ )
                      
             {
                 System.out.println( c + " " + n );
             }
         }
 //1)The int n variable changes faster.
 //2) Once the loops are switched, the inner loop "c" changes faster.
         System.out.println("\n");
 
         // this is #2 - I'll call it "AB"
         for ( int a=1; a <= 3; a++ )
         {
             for ( int b=1; b <= 3; b++ )
             {
                 System.out.print( a + "-" + b + " " );
             }
             System.out.println();
         }
 
         System.out.println("\n");
    }
}
//3)The out is changed into a vertical line format
/*4)The system.out.println--prints everything in a row/column format (all of the 1-'s are in the first row/ the 2-'s are a second row/ the 3-'s are in the third row'). 
with the final println("\n"), it prints each set of println's onto a new line*/