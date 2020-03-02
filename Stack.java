public class Stack implements intf_Stack{
    public void pop(){
        int rm = storage.size()-1;
        storage.remove(rm);
    }
    public int push(int a){
        storage.add(a);
        return 0;
    }
    public void show(){
        int i=storage.size()-1;
        while(i!=-1){
            System.out.println("|"+storage.get(i)+"|");
            i--;
        }
    }
 
}