package oni;

/**
 * https://www.dcc.fc.up.pt/oni/problemas/2005/final/probB.html
 */
public class ProblemaB2005 {
    /**
     * l = numero de niveis (1 < l < 20)
     * n = numero o numero de bolas (bola n) (1 <= n <= 1000000)
     * c = numero de casos a considerar
     * <p>
     * A estrutura desse desafio eh uma arvore binaria completa
     * Portanto o numero de baldes eh 2 elevado a L
     */
    private int l;
    private int n;
    private int c;
    private int numeroDeBaldes = 2;

    // linha = Cada caso é representado por uma linha contendo dois números inteiros separados por um espaço, L N
    public void input(String linha) {

        String numerosStr[] = linha.split(" ");

        if (numerosStr.length != 2) {
            System.out.println("Valor da entrada inválido.\nex: 2 1");
            l = -1;
            n = -1;
        } else {
            l = Integer.parseInt(numerosStr[0]);
            n = Integer.parseInt(numerosStr[1]);

            if (l <= 1 || l >= 20) {
                System.out.println("Valor de L inválido");
                l = -1;
            }
            if (n > 1000000 || n < 1) {
                System.out.println("Valor de N inválido");
                n = -1;
            }
        }
    }

    public void calculaNumeroDeBaldes() {
        numeroDeBaldes = (int) Math.pow(2, l);
    }

    public int numeroDoBaldeQueAUltimaBOlaCaiu() {
        int numeroDoBalde = numeroDeBaldes;
        int metade = numeroDeBaldes / 2;
        int metadeVariante = metade / 2;
        int t = 1;
        System.out.println(numeroDoBalde);
        for (int i = 1; i < n; i++) {
            if (numeroDoBalde == 2) {
                numeroDoBalde = numeroDeBaldes - 1;
                metadeVariante = metade / 2;
                t = 1 - t;
            } else if (numeroDoBalde == 1) {
                numeroDoBalde = numeroDeBaldes;
                metadeVariante = metade / 2;
                t = 1 - t;
            } else if (numeroDoBalde != 2 && numeroDoBalde != 1) {
                if(t == 1){
                    numeroDoBalde -= metade;
                } else {
                    numeroDoBalde = numeroDeBaldes - metadeVariante;
                    metadeVariante /= 2;
                }
                t = 1 - t;
            }
            System.out.println(numeroDoBalde);
        }
        return numeroDoBalde;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getNumeroDeBaldes() {
        return numeroDeBaldes;
    }

    public void setNumeroDeBaldes(int numeroDeBaldes) {
        this.numeroDeBaldes = numeroDeBaldes;
    }
}
