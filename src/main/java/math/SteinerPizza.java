package math;

public class SteinerPizza {
    /**
     * Mathematical formula
     * principle of finite induction
     * Maximum number of pieces that a pizza can be divided by "n" straight cuts
     * (2 + n + n^2)/2  where n = number of cuts
     */

    public static int maximumNumberOfPieces(int cuts){
        if(cuts == 0){
            return 1;
        } else {
            int x = maximumNumberOfPieces(cuts - 1);
            x += cuts;
            return  x;
        }
    }
}
