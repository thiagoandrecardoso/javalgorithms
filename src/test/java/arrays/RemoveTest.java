package arrays;

import org.junit.jupiter.api.Test;

import static arrays.Remove.removeItemFromPositionAndReturnNewSize;
import static builders.ArrayBuilder.aArray;
import static org.junit.jupiter.api.Assertions.*;

class RemoveTest {

    public int sizeArray = 5;

    @Test
    public void checkArraySizeAfterRemovingAnIntem() {
        assertEquals(4, removeItemFromPositionAndReturnNewSize(2, aArray().withValueFromOneToFive().now(), sizeArray));
    }

    @Test
    public void checkIfTheValueAtPositionZeroHasBeenDeleted() {
//        1, 2, 3, 4, 5
        int array[] = aArray().withValueFromOneToFive().now();
        removeItemFromPositionAndReturnNewSize(0, array, sizeArray);

        assertEquals(2, array[0]);
    }

    @Test
    public void checkIfTheValueAtLastPositionHasBeenDeleted() {
//        1, 2, 3, 4, 5
        int array[] = aArray().withValueFromOneToFive().now();
        int lastValue = removeItemFromPositionAndReturnNewSize(4, array, sizeArray);

        assertEquals(4, array[lastValue - 1]);
    }

}