public class Intf_Implement implements intf_a,intf_b{

  public void printa(){
    System.out.println(a);
  }
  public int[] print(int a,int b){
    int Avg=0;
    int Sum=0;
    int[] to_return = new int[2];
    Sum = a+b;
    Avg = (a+b)/2;
    
    to_return[0] = Avg;
    to_return[1] = Sum;
    return to_return;
  }

  public void printb(){
    System.out.println(b);
  }
  public static void main(String[] args) {
      Intf_Implement obj = new Intf_Implement();
      obj.printa();
      obj.printb();
      int[] SumAvg = new int[2];
      SumAvg = obj.print(a,b);
      System.out.println("Sum is: "+SumAvg[0]+"; Average is: "+SumAvg[1]);
  }


}
