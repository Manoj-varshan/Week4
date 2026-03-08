

class Result {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();
        int d1 = 0, d2 = 0;

        for (int i = 0; i < n; i++) {
            d1 += arr.get(i).get(i);
            d2 += arr.get(i).get(n - 1 - i);
        }

        return Math.abs(d1 - d2);
    }
}