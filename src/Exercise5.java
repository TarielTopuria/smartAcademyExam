public class Exercise5 {
    public static void modeCalculator(){
        int[] myArray = new int[] {0, 7, 7, 2, 7, 3, 5};

        int maxValue = 0;
        int maxCount = 0;

        for (int k : myArray) {
            int count = 0;
            for (int i : myArray) {
                if (i == k)
                    ++count;
            }

            if (count > maxCount) {
                maxCount = count;
                maxValue = k;
            }
        }
        System.out.println("მასივის მოდაა " + maxValue);
    }
}
