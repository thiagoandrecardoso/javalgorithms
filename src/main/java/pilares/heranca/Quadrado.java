package pilares.heranca;

public class Quadrado extends FiguraGeometrica{
    private float valorLado;

    public Quadrado(int numeroDeLados, float area, float perimetro, int numeroDeAngulos){
        this.setNumeroDeLados(numeroDeLados); // USANDO O METODO DE ACESSO PARA ALTERAR O VALOR
        this.area = area;
        this.perimetro = perimetro;
        this.numeroDeAngulos = numeroDeAngulos;
    }
}
