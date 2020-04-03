package oni;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemaB2005Test {
    ProblemaB2005 problemaB2005;

    @Test
    public void verificaNumerosExtraidosDaLinhaL(){
        problemaB2005 = new ProblemaB2005();
        problemaB2005.input("2 1");
        assertEquals(2, problemaB2005.getL());
    }

    @Test
    public void verificaNumerosExtraidosDaLinhaN(){
        problemaB2005 = new ProblemaB2005();
        problemaB2005.input("2 1");
        assertEquals(1, problemaB2005.getN());
    }

    @Test
    public void deveRetornarMenosHumQuandoLforMaioOuIgualA20(){
        problemaB2005 = new ProblemaB2005();
        problemaB2005.input("20 1");
        assertEquals(-1, problemaB2005.getL());
    }

    @Test
    public void deveRetornarMenosHumQuandoLforMenorOuIgualA1(){
        problemaB2005 = new ProblemaB2005();
        problemaB2005.input("1 1");
        assertEquals(-1, problemaB2005.getL());
    }

    @Test
    public void deveRetornarMenosHumQuandoNforMaioA1000000(){
        problemaB2005 = new ProblemaB2005();
        problemaB2005.input("2 1000001");
        assertEquals(-1, problemaB2005.getN());
    }

    @Test
    public void deveRetornarMenosHumQuandoNforMenorQue1(){
        problemaB2005 = new ProblemaB2005();
        problemaB2005.input("2 0");
        assertEquals(-1, problemaB2005.getN());
    }

    @Test
    public void calculoExpoente(){
        problemaB2005 = new ProblemaB2005();
        problemaB2005.input("2 1");
        problemaB2005.calculaNumeroDeBaldes();
        assertEquals(4, problemaB2005.getNumeroDeBaldes());
    }

    @Test
    public void numeroDoBaldeIgualA4(){
        problemaB2005 = new ProblemaB2005();
        problemaB2005.input("2 1");
        problemaB2005.calculaNumeroDeBaldes();
        int numeroDoBalde = problemaB2005.numeroDoBaldeQueAUltimaBOlaCaiu();
        assertEquals(4, numeroDoBalde);
    }

    @Test
    public void numeroDoBaldeIgualA2(){
        problemaB2005 = new ProblemaB2005();
        problemaB2005.input("2 2");
        problemaB2005.calculaNumeroDeBaldes();
        int numeroDoBalde = problemaB2005.numeroDoBaldeQueAUltimaBOlaCaiu();
        assertEquals(2, numeroDoBalde);
    }

    @Test
    public void numeroDoBaldeIgualA3(){
        problemaB2005 = new ProblemaB2005();
        problemaB2005.input("2 3");
        problemaB2005.calculaNumeroDeBaldes();
        int numeroDoBalde = problemaB2005.numeroDoBaldeQueAUltimaBOlaCaiu();
        assertEquals(3, numeroDoBalde);
    }

    @Test
    public void numeroDoBaldeIgualA1(){
        problemaB2005 = new ProblemaB2005();
        problemaB2005.input("2 4");
        problemaB2005.calculaNumeroDeBaldes();
        int numeroDoBalde = problemaB2005.numeroDoBaldeQueAUltimaBOlaCaiu();
        assertEquals(1, numeroDoBalde);
    }

    @Test
    public void numeroDoBaldeIgualA4Com2E5(){
        problemaB2005 = new ProblemaB2005();
        problemaB2005.input("2 5");
        problemaB2005.calculaNumeroDeBaldes();
        int numeroDoBalde = problemaB2005.numeroDoBaldeQueAUltimaBOlaCaiu();
        assertEquals(4, numeroDoBalde);
    }

    @Test
    public void  numeroDoBaldeIgualA6Com3E3(){
        problemaB2005 = new ProblemaB2005();
        problemaB2005.input("3 3");
        problemaB2005.calculaNumeroDeBaldes();
        int numeroDoBalde = problemaB2005.numeroDoBaldeQueAUltimaBOlaCaiu();
        assertEquals(6, numeroDoBalde);
    }
}