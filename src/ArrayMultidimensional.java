public class ArrayMultidimensional {
    public void arrayMultidimensional() {
        int[][] num = {{1, 2, 3, 4}, {5, 6, 7}};
        // 1 -> 5
        // 1 -> 6
        // 1 -> 7

        // 2 -> 5
        // 2 -> 6
        // 2 -> 7

        // 3 -> 5
        // 3 -> 6
        // 3 -> 7

        // 4 -> 5
        // 4 -> 6
        // 4 -> 7

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.println(num[i][j]);
            }
        }
    }
}
