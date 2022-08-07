package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power >= 0) {
            System.out.println(1);
        } else {
            System.out.println("too much power");
        }

        int i = 1, result = 1;
        while (i <= power) {
            result *= 2;
            i++;
            System.out.println(result);
        }

    }

    public static void main(String[] args) {
        PowerOfTwo p = new PowerOfTwo();
        p.printPower(4);
    }
}
