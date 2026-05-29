public class StarPattern {
    public static void main(String[] args) {

       
        // Pattern 1 : Increasing Star Triangle
       
        /*
            Output:
            *
            **
            ***
            ****
        */

        System.out.println("Pattern 1 : Increasing Triangle");

    
        for (int i = 1; i <= 4; i++) {

          
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

           
            System.out.println();
        }

        System.out.println(); 

        // Pattern 2 : Decreasing Star Triangle
       
        /*
            Output:
            ****
            ***
            **
            *
        */

        System.out.println("Pattern 2 - Decreasing Triangle");

       
        for (int i = 1; i <= 4; i++) {

           
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }

            
            System.out.println();
        }
    }
}