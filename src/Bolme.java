public class Bolme {
    int a;
    int b=0;
    String c="/";
    public Integer Bolme (int a, String c, int b) {
        if(c=="/"){
        System.out.println(a/b);
        }
        else if( b==0){
            System.out.println("Cannot divide by zero");
    }
        return a / b;

    }
}
