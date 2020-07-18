import java.util.ArrayList;
import java.util.List;

public class RepresentStack {

    public static List<Integer> CreateStack(int x){
        List<Integer> listStack= new ArrayList<Integer>();
        for(int i=0; i<x; i++){
            listStack.add(i);
        }
        return listStack;
    }

    public static void PushInStack(int x,List<Integer> stackList){
        stackList.add(x);
        System.out.println("Add to list: "+ stackList.get(stackList.size()-1));
    }

    public static void PopInStack(List<Integer> stackList){

        System.out.println("Remove from list: "+ stackList.remove(stackList.size()-1));
    }

    public static void PeakInStack(List<Integer> stackList){
        System.out.println("In the top of the slack is number: " + stackList.get(stackList.size()-1));

    }
}
