package arrays;

import exception.PassingNullArrayException;
import org.junit.jupiter.api.Test;

import static arrays.Operation.diferenceBetweenHighestAndLowestValue;
import static builders.ArrayBuilder.aArray;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


class OperationTest {

    @Test
    public void mustReturnFour_usingArrayWithValuesFromOneToFive() throws PassingNullArrayException {
        int array[] = aArray().withValueFromOneToFive().now();
        int highest = array[0];
        int lowest = array[0];

        assertEquals(4, diferenceBetweenHighestAndLowestValue(array, array.length, 1, highest, lowest));
    }

    @Test
    public void mustReturnZero_usingArrayWithUniqueValue() throws PassingNullArrayException {
        int array[] = aArray().withAllValuesEqualsToZero().now();
        int highest = array[0];
        int lowest = array[0];

        assertEquals(0, diferenceBetweenHighestAndLowestValue(array, array.length, 1, highest, lowest));
    }

    @Test
    public void handlesErroPassingNullArray() {
        int array[] = null;
        int highest = 0;
        int lowest = 0;

        try {
            diferenceBetweenHighestAndLowestValue(array, 0, 1, highest, lowest);
            fail();
        } catch (PassingNullArrayException e) {
            assertEquals(e.getMessage(), "Erro passing null array");
        }

    }

}