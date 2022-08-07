package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {

        if (printToInclusive < 2) {
            return;
        }
        int counter, i = 2;
        while (i <= printToInclusive) {
            counter = 0;
            int j = 2;
            while (j < i) {
                if (i % j == 0) {
                    counter++;
                }
                j++;
            }
            if (counter == 0) {
                System.out.println(i);
            }
            i++;

        }
    }


    public static void main(String[] args) {
        PrimeNumbers p = new PrimeNumbers();
        p.printPrimeNumbers(33);
    }
}

