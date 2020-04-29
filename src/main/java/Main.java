public class Main {

    public static void main(String[] args) {

        StreamDemo streamDemo = new StreamDemo();
        LambdaDemo lambdaDemo = new LambdaDemo();

        streamDemo.printNumberOfOccurrencesObject();
        streamDemo.printThirdElement();
        streamDemo.printTwoItemsStartingFromSecond();
        lambdaDemo.printNewArray();
    }
}
