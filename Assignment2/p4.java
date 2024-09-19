// package Assignment2;

public class p4 {
    public static void main(String[] args) {
        Number n = new Number(153);
        System.out.println(n.isArmstrong());
    }
}

class Number {
    private double num;

    Number(double num) {
        this.num = num;
    }

    boolean isZero() {
        return num == 0;
    }

    boolean isPositive() {
        return num > 0;
    }

    boolean isNegative() {
        return num < 0;
    }

    boolean isOdd() {
        return num % 2 == 1;
    }

    boolean isEven() {
        return num % 2 == 0;
        // return !isOdd();
    }

    boolean isPrime() {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    boolean isArmstrong() {
        int sum = 0;
        String ts[] = String.valueOf((int) num).split("");

        for (String s : ts) {
            sum += Math.pow(Integer.parseInt(s), ts.length);
        }

        return sum == num;
    }
}
