public class BasicProblems {
    public int nonPairNumber() {
        int result = 0;
        int[] numbers = {1, 2, 1, 4, 4, 6, 8, 6, 8};
        for (int i = 0; i < numbers.length; i++) {
            result = result ^ numbers[i];
        }
        return result;
    }

    public void numberSwitch() {
        int a = 5;
        int b = 7;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + " b = " + b);
    }
}
