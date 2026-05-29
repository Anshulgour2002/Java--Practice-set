public class prime_number {
    public static void main(String[] args) {
        int num=21;
      boolean isprime= true;
        for (int i=2;i<num;i++){
         if(num%i==0){
            isprime= false;
         }
        
        }
         if(isprime==false){
            System.out.println("Number is not prime");
         }
         else{
            System.out.println("Number is prime");
         }
    }
}
