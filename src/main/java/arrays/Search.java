package arrays;
public class Search {

    /**
     * @param x value to look for in array
     * @param v array
     * @param n array size
     * @return position
     */

//    right to left search
    public static int valuePositionModeOne(int x, int v[], int n) {
        int k = n - 1;
        while (k >= 0 && v[k] != x) {
            k--;
        }
        return k;
    }

//    right to left search
    public static int valuePositionModeTwo(int x, int v[], int n) {
        for (int k = n - 1; k >= 0; k--) {
            if (v[k] == x) {
                return k;
            }
        }
        return -1;
    }

//    left to right search
    public static int valuePositionModeThree(int x, int v[], int n) {
        int k = 0;
        while (k < n && v[k] != x) {
            k++;
        }
        if (v[k] == x) {
            return k;
        }
        return -1;
    }

//    right to left search
    public static int valuePositionRecursive(int x, int v[], int n) {
        if (n == 0) {
            return -1;
        }
        if (x == v[n - 1]) {
            return n - 1;
        } else {
            return valuePositionRecursive(x, v, n - 1);
        }
    }
}
