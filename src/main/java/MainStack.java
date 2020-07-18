import java.util.List;

public class MainStack {
    public static void main(String[] args) {

        //Check represent of stack
        List<Integer> stack = RepresentStack.CreateStack(10);
        //RepresentStack.PushInStack(45,stack); // Because i change my list to String
        RepresentStack.PopInStack(stack);
        RepresentStack.PeakInStack(stack);

        //Reverse a string using only a stack
        CheckLists.ReverseString("MARIOS");
    }
}
