public class LoopPuzzles {

    // Read REQ 02
    public int stepsToOne(int start) {
        int steps = 0;

        if (start < 1) {
            return -1;
        }
        while (start != 1) {
            int value = start;
            if (start % 2 == 0) {
                value /= 2;
                steps += 1;
            }
            if (start % 2 != 0) {
                value = 3 * value + 1;
                steps += 1;
            }
        }
        return steps;
    }

    // Read REQ 03
    public int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        int sum = (int) (Math.abs(n));
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    // Read REQ 04
    public int reverseDigits(int n) {
        boolean negative = false;
        if (n < 0) {
            negative = true;
        }
        int sum = (int) (Math.abs(n));
        while (n > 0) {
            sum += n % 10;
            sum = sum * 10 + n;
            n = n / 10;
        }
        if (negative) {
            sum = sum * -1;
        }
        return sum;
    }

    // Read REQ 05
    public boolean isPowerOfThree(int n) {
        return true;
    }

    // Read REQ 06
    public int firstRunningTotalAbove(int limit) {
        return -999;
    }

    // Read REQ 07
    public String readUntilSentinel(String csv, String sentinel) {
        return "TODO";
    }
}
