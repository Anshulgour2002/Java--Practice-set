public class Constructor {
    int rollno;
    String name;

    public Constructor(int n ,String r){
    rollno=n;
    name=r;

    }
    public static void main(String[] args) {

        Constructor value=new Constructor(1001, "Anshul");
        Constructor value2=new Constructor(1002, "Sajal");

            System.out.println(value.rollno);
            System.out.println(value.name);
            System.out.println(value2.rollno);
            System.out.println(value2.name);
            
    }
}
