package arrays;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.fail;

public class OrderTest {

    Order order = new Order();

    @Test
    public void retornaOMaiorValorTest() {
        int[] array = {1, 2, 3, 4};
        Assert.assertEquals(4, order.retornaOMaiorValor(array));
    }

    @Test
    public void retornaOMaiorValorTest1() {
        int[] array = {-1, -2, -3, -4};
        Assert.assertEquals(-1, order.retornaOMaiorValor(array));
    }

    @Test
    public void retornaOMaiorValorTest2() {
        int[] array = {0};
        Assert.assertEquals(0, order.retornaOMaiorValor(array));
    }

    @Test
    public void retornaOMaiorValorTest3() {
        int[] array = {};
        try {
            order.retornaOMaiorValor(array);
            fail();
        } catch (ArrayIndexOutOfBoundsException e) {
//            assertThat(e.getMessage(), is("Usuário vazio"));
            System.out.println("ERROR");
        }
    }

    @Test
    public void retornaOMaiorValorTest4() {
        int[] array = {1, 2, 3};
        try {
            order.retornaOMaiorValor(array);
        } catch (ArrayIndexOutOfBoundsException e) {
//            assertThat(e.getMessage(), is("Usuário vazio"));
            fail();
        }
    }

}