package arrays;

import exception.PassingNullArrayException;

public class Operation {
    /**
     * @param v       array
     * @param length
     * @param i       position
     * @param highest
     * @param lowest
     * @return int
     */
    public static int diferenceBetweenHighestAndLowestValue(int v[], int length, int i, int highest, int lowest) throws PassingNullArrayException {
        if(v == null){
            throw new PassingNullArrayException("Erro passing null array");
        }
        if (length == i) {
            return highest - lowest;
        } else {
            if (v[i] > highest) {
                return diferenceBetweenHighestAndLowestValue(v, length, i + 1, v[i], lowest);
            } else if (v[i] < lowest) {
                return diferenceBetweenHighestAndLowestValue(v, length, i + 1, highest, v[i]);
            } else {
                return diferenceBetweenHighestAndLowestValue(v, length, i + 1, highest, lowest);
            }
        }
    }
}
