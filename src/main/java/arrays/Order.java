package arrays;

public class Order {

    public int retornaOMaiorValor(int[] array) {
        int aux = array[0];
        for (int i = 0; i < array.length; i++){
            aux = Math.max(aux, array[i]);
        }
        return aux;
    }

}
