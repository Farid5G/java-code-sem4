class VarargExample {
    public static void sumNumbers(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        sumNumbers(2, 4);
        sumNumbers(1, 3, 5);
        sumNumbers(1, 3, 5, 7);
    }
}
