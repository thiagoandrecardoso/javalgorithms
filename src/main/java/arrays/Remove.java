package arrays;

public class Remove {

    /**
     * @param position position where the value will be deleted
     * @param v array
     * @param n array size
     * @return new size
     */

    public static int removeItemFromPositionAndReturnNewSize(int position, int v[], int n){
        for (int i = position; i < n - 1; i++) {
            v[i] = v[i + 1];
        }
        return n - 1;
    }
}
