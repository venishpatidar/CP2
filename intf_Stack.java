import java.util.*;

interface intf_Stack{
    List<Integer> storage = new ArrayList<Integer> ();
    void pop();
    int push(int a);
    void show();
}