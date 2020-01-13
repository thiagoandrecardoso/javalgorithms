package builders;


public class ArrayBuilder {

    private static int sizeArray = 5;
    private int array[];

    private ArrayBuilder() {
    }

    public static ArrayBuilder aArray() {
        ArrayBuilder arrayBuilder = new ArrayBuilder();
        arrayBuilder.array = new int[sizeArray];
        return arrayBuilder;
    }

    public ArrayBuilder withValueFromOneToFive() {
        for (int i = 0; i < sizeArray; i++) {
            array[i] = i + 1;
        }
        return this;
    }

    public ArrayBuilder withAllValuesEqualsToZero() {
        for (int i = 0; i < sizeArray; i++) {
            array[i] = 0;
        }
        return this;
    }

    public int[] now() {
        return array;
    }

}
