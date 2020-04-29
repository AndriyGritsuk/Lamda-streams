import java.util.Arrays;
import java.util.List;

public class StreamDemo {

    List<String> nums = Arrays.asList("s1", "s2", "s3", "s1");
    long occurrences = nums.stream().filter("s1"::equals).count();

    public void printNumberOfOccurrencesObject(){
        System.out.println("Number of occurrences of the object s1 = " + occurrences);
    }

    String thirdItem = nums.stream().skip(2).findFirst().get();

    public void printThirdElement(){
        System.out.println("The third element is " + thirdItem);
    }

    Object[] twoItemsStartingFromSecond = nums.stream().skip(1).limit(2).toArray(String[]::new);

    public void printTwoItemsStartingFromSecond(){
        System.out.println("Two items starting from the second are " + Arrays.toString(twoItemsStartingFromSecond));
    }

}
