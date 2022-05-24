package controller;

public class ImpostoStrategySP implements InterfaceNumComodos {

    private int areaTotal;
    private int numComodos;

    @Override
    public void ifcAreaTotal(int areaTotal) {
        this.areaTotal = areaTotal;
    }
    @Override
    public void ifcNumComodos(int numComodos) {
        this.numComodos = numComodos;
    }
    @Override
    public void ifcCalculoImposto() {
        double imposto = ((this.areaTotal*10) + (this.numComodos*2));
        System.out.println("Imposto Cidade de São Paulo: " + imposto);
    }

}