public class fibonnaci {

    public static void main (String[] args){

//  int num1=0;
//  int num2=1;
//  int time=10;

// System.out.println(num1);
// System.out.println(num2);


//  for(int i=1;i<time;i++){
    
// int num3 = num1 + num2;
    
//     System.out.println(num3);

//     num1=num2;                                         
//     num2=num3;
// }


int n1=0 , n2=1;
System.out.print(n1+","+n2);


for(int i=0;i<=10;i++){
int sum=n1+n2;
System.out.print(","+sum);

n1=n2;
n2=sum;
}
}
}