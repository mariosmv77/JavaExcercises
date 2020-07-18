import java.util.ArrayList;
import java.util.List;

public class RepresentStack {

    public  static List CreateStack(int x){
        List listStack= new ArrayList();
        for(int i=0; i<x; i++){
            listStack.add(i);
        }
        return listStack;
    }

    public static void PushInStack(char x,List stackList){
        stackList.add(x);
        //This neednt in case of reverse string with stack
        //System.out.println("Add to list: "+ stackList.get(stackList.size()-1));
    }

    public static void PopInStack(List stackList){

       // System.out.println("Remove from list: "+ stackList.remove(stackList.size()-1));
        //For reserve the string
        System.out.println( stackList.remove(stackList.size()-1));
    }

    public static void PeakInStack(List stackList){
        System.out.println("In the top of the stack is number: " + stackList.get(stackList.size()-1));

    }
}
