package controller;

public class ImpostoStrategyBH implements InterfaceNumQuartos {

    private int areaTotal;
    private int numQuartos;

    @Override
    public void ifcAreaTotal(int areaTotal) {
        this.areaTotal = areaTotal;
    }
    @Override
    public void ifcNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }
    @Override
    public void ifcCalculoImposto() {
        double imposto = (this.areaTotal*7) + (this.numQuartos*4);
        System.out.println("Imposto Cidade de Belo Horizonte: " + imposto);
    }
}