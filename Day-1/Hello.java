public class Hello{
    public static void main(String[] args){
   int num=3;
   boolean isprime=true;
   for(int i=2;i<num;i++){
     if(num%i==0){
        isprime=false;
     } 
   }
   if (isprime==false) {
    System.out.println("Not prime");
   }
   else{
    System.out.println("Prime");
   }
    } 
}

