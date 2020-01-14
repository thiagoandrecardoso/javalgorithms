package arrays;

import org.junit.jupiter.api.Test;

import static arrays.Search.*;
import static builders.ArrayBuilder.aArray;
import static org.junit.jupiter.api.Assertions.*;

class SearchTest {

    public int sizeArray = 5;

    @Test
    public void positionReturnWithDiferenteValuesInArray_valuePositionModeOne(){

        assertEquals(4, valuePositionModeOne(5, aArray().withValueFromOneToFive().now(), sizeArray));

    }

    @Test
    public void positionReturnWithDiferenteValuesInArray_valuePositionModeTwo(){

        assertEquals(4, valuePositionModeTwo(5, aArray().withValueFromOneToFive().now(), sizeArray));

    }

    @Test
    public void positionReturnWithDiferenteValuesInArray_valuePositionModeThree(){

        assertEquals(4, valuePositionModeThree(5, aArray().withValueFromOneToFive().now(), sizeArray));

    }

    @Test
    public void positionReturnWithDiferenteValuesInArray_vvaluePositionRecursive(){

        assertEquals(4, valuePositionRecursive(5, aArray().withValueFromOneToFive().now(), sizeArray));

    }

    @Test
    public void positionReturnWithEqualsValuesInArray_valuePositionModeOne(){

        assertEquals(4, valuePositionModeOne(0, aArray().withAllValuesEqualsToZero().now(), sizeArray));

    }

    @Test
    public void positionReturnWithEqualsValuesInArray_valuePositionModeTwo(){

        assertEquals(4, valuePositionModeTwo(0, aArray().withAllValuesEqualsToZero().now(), sizeArray));

    }

    @Test
    public void positionReturnWithEqualsValuesInArray_valuePositionModeThree(){

        assertEquals(0, valuePositionModeThree(0, aArray().withAllValuesEqualsToZero().now(), sizeArray));

    }

    @Test
    public void positionReturnWithEqualsValuesInArray_valuePositionRecursive(){

        assertEquals(4, valuePositionRecursive(0, aArray().withAllValuesEqualsToZero().now(), sizeArray));

    }

}