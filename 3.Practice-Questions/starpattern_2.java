public class starpattern_2 {
    public static void main(String[] args) {

        
        // Pattern 1 : Right Side Increasing Triangle
       
        /*
               *
              **
             ***
            ****
        */

        System.out.println("Pattern 1 : Right Side Increasing Triangle");

        for (int i = 1; i <= 4; i++) {

                for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }



        System.out.println(); 



    
        // Pattern 2 : Right Side Decreasing Triangle
       
        /*
            ****
             ***
              **
               *
        */

        System.out.println("Pattern 2 : Right Side Decreasing Triangle");

       
        for (int i = 1; i <= 4; i++) {

           
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

          
            for (int k = 4; k >= i; k--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
