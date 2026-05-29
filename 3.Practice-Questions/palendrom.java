public class palendrom{
    public static void main (String[] args){
         
        int num=171;
        int orignal=num;
        int rev=0;

        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
            

    }

    if(orignal==rev){
        System.out.println("Number is palendrom");
    }
    else{
        System.out.println("Number is not palendrom");

        
    }
}
}