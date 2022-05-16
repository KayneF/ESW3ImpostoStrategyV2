package controller;

import model.BeloHorizonte;

public class ImpostoStrategyBH implements IImpostoStrategy {

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
    public void calculoImposto() {
        double imposto = (this.areaTotal*7) + (this.numQuartos*4);
        System.out.println("Imposto Cidade de Belo Horizonte: " + imposto);
    }


    // UNUSED
    @Override
    public void ifcNumComodos(int numComodos) {
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
