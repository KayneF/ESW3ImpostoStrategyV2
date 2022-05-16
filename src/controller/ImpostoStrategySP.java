package controller;

public class ImpostoStrategySP implements IImpostoStrategy {

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
    public void calculoImposto() {
        double imposto = ((this.areaTotal*10) + (this.numComodos*2));
        System.out.println("Imposto Cidade de São Paulo: " + imposto);
    }


    // UNUSED
    @Override
    public void ifcNumQuartos(int numQuartos) {
    }
    @Override
    public void ifcGaragem(boolean isGaragem) {
    }
    @Override
    public void ifcAreaGaragem(int areaGaragem) {
    }
    @Override
    public void ifcIdadeImovel(int idadeImovel) {
    }


}
