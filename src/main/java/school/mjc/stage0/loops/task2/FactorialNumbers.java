package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        if (printToInclusive >= 0){
            System.out.println(1);
        }
        int i = 1, fact = 1;
        while (i <= printToInclusive) {

            fact = i * fact;
            i++;
            System.out.println(fact);
        }
    }

    public static void main(String[] args) {
        FactorialNumbers f = new FactorialNumbers();
        f.printFactorialRow(7);
    }

}
