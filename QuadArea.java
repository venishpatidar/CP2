public class QuadArea{
    public static String area(int a,int b){
        int c;
        String cc;
        if(a == b){
            c = a*b;
            cc = String.format("%d",c);
            String s = "The area of Square is " + c + " unit\n";
            return s;
        }
        else{
            return "Bad Argument\n";
        }
    }   
}