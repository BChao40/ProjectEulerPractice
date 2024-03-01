import java.math.BigInteger;

public class Problem15{
    public static void main(String[] args){
        /*
        int gridSize = 20;
        int paths = countPaths(0, 0, gridSize);
        System.out.println(paths);
        */
        System.out.println(combination(40, 20));
    }

    /*
    public static int countPaths(int x, int y, int size){
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
    */

    //you can use combinatorics instead because you know for any nxn grid, there is a total of 2n moves to be made to reach the bottom right corner from the top left corner,
    //and there is n moves going right and n moves going left. you can use the combination formula C(n,k) = n! / (k! * (n-k)!)

    public static long combination(int n, int k){ // for a 20x20 grid, n should be 40 because of 40 moves to be made and k should be 20 (finding combinations of the 20 of either down or right will inherently choose the 20 moves of the other type)
        return factorial(n) / (factorial(k) * factorial(n-k));
    }

    public static long factorial(int x){
        long result = 1;
        for (long i = x; i >= 2; i--){
            result *= i;
        }
        return result;
    }
}
