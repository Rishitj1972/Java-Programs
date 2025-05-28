//Check whether the given number is Armstrong or not 


class java3_7 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3); 
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}

