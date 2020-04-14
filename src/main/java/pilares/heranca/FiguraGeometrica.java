package pilares.heranca;

public class FiguraGeometrica {
    private int numeroDeLados;
    protected float area;
    public float perimetro;
    int numeroDeAngulos;

    /**
     * Podemos usar os metodos acessores Getter and Setter
     * para alterar e pegar o valor desta variável
     */
    public int getNumeroDeLados() {
        return numeroDeLados;
    }

    public void setNumeroDeLados(int numeroDeLados) {
        this.numeroDeLados = numeroDeLados;
    }
}
