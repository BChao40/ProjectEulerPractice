public class Problem15{
    public static void main(String[] args) {
        int gridSize = 20;
        int paths = countPaths(0, 0, gridSize);
        System.out.println(paths);
    }

    public static int countPaths(int x, int y, int size) {
        // when you're at the bottom right corner, there is exactly 1 path (you're already there)
        if (x == size && y == size){
            return 1;
        }
        // if you're out of bounds, there are 0 paths
        if (x > size || y > size){
            return 0;
        }
        // the total paths from a point is the sum of the paths going right and going down
        return countPaths(x + 1, y, size) + countPaths(x, y + 1, size);
    }
}
