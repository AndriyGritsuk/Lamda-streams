import java.util.Arrays;
import java.util.List;

public class LambdaDemo {

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    int[] newList = list.stream().mapToInt(a -> a*2).toArray();

    public void printNewArray(){
        System.out.println("Values multiplied by 2: " + Arrays.toString(newList));
    }
}
