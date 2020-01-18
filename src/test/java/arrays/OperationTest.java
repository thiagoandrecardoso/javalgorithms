package arrays;

import exception.PassingNullArrayException;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ErrorCollector;
import org.junit.rules.ExpectedException;

import static builders.ArrayBuilder.aArray;
import static org.junit.jupiter.api.Assertions.assertEquals;


class OperationTest {

    @Rule
    public ErrorCollector error = new ErrorCollector();
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void mustReturnFour_usingArrayWithValuesFromOneToFive() throws PassingNullArrayException {
        int array[] = aArray().withValueFromOneToFive().now();
        int highest = array[0];
        int lowest = array[0];

        assertEquals(4, Operation.diferenceBetweenHighestAndLowestValue(array, array.length, 1, highest, lowest));
    }

    @Test
    public void mustReturnZero_usingArrayWithUniqueValue() throws PassingNullArrayException {
        int array[] = aArray().withAllValuesEqualsToZero().now();
        int highest = array[0];
        int lowest = array[0];

        assertEquals(0, Operation.diferenceBetweenHighestAndLowestValue(array, array.length, 1, highest, lowest));
    }

    @Test
    public void handlesErroPassingNullArray() throws Exception {
        int array[] = null;
        int highest = 0;
        int lowest = 0;

        exception.expect(PassingNullArrayException.class);
        exception.expectMessage("Erro passing null array");

        Operation.diferenceBetweenHighestAndLowestValue(array, 0, 1, highest, lowest);
    }

}