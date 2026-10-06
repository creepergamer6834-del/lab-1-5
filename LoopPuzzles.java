public class LoopPuzzles {

    // Read REQ 02
    public int stepsToOne(int start) {
        int steps = 0;

        if (start < 1) {
            return -1;
        }
        while (start != 1) {
            if (start % 2 == 0) {
                start /= 2;
                steps += 1;
            } else if (start % 2 != 0) {
                start = 3 * start + 1;
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
        n = (int) (Math.abs(n));
        int sum = 0;
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
        n = (int) (Math.abs(n));
        int sum = 0;
        while (n > 0) {
            sum = sum * 10;
            sum += n % 10;

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
