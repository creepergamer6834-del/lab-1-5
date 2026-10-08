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
        int i = 0;
        while (Math.pow(3, i) <= n) {
            if (n == Math.pow(3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    // Read REQ 06
    public int firstRunningTotalAbove(int limit) {
        int total = 0;
        int adding = 1;
        while (total <= limit) {
            total += adding;
            adding++;
        }
        return total;
    }

    // Read REQ 07
    public String readUntilSentinel(String csv, String sentinel) {
        String unread = csv;
        String result = "";

        while (!unread.isEmpty()) {
            int commaIndex = unread.indexOf(",");
            String token;
            if (commaIndex == -1) {
                token = unread;
                unread = "";
            } else {
                token = unread.substring(0, commaIndex);
                unread = unread.substring(commaIndex + 1);
            }
            if (token.equals(sentinel)) {
                return result;
            }

            if (result.isEmpty()) {
                result = token;
            } else {
                result += " " + token;
            }
        }
        return result;
    }

    public int countDigits(int n) {
        if (n < 0) {
            n = -n;
        }
        int count = 0;
        do {
            count++;
            n = n / 10;
        } while (n > 0);
        return count;
    }

    public int startWithMostSteps(int limit) {
        int maxSteps = -1;
        int bestStart = 1;

        for (int i = 1; i <= limit; i++) {
            int steps = 0;
            int current = i;

            while (current != 1) {
                if (current % 2 == 0) {
                    current = current / 2;
                } else {
                    current = 3 * current + 1;
                }
                steps++;
            }

            if (steps > maxSteps) {
                maxSteps = steps;
                bestStart = i;
            }
        }

        return bestStart;
    }
}
