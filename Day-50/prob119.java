class prob119 {
    static int tour(int[] gas, int[] cost) {
        int total = 0, curr = 0, start = 0;
        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
            curr += gas[i] - cost[i];
            if (curr < 0) {
                start = i + 1;
                curr = 0;
            }
        }
        return total >= 0 ? start : -1;
    }

    public static void main(String[] args) {
        int[] gas = { 4, 6, 7, 4 };
        int[] cost = { 6, 5, 3, 5 };
        System.out.println(tour(gas, cost));
    }
}
