package controller;

import model.PortoAlegre;

public class ImpostoStrategyPA implements IImpostoStrategy {

    private int areaTotal;
    private int numQuartos;
    private boolean isGaragem;

    @Override
    public void ifcAreaTotal(int areaTotal) {
        this.areaTotal = areaTotal;
    }
    @Override
    public void ifcGaragem(boolean isGaragem) {
        this.isGaragem = isGaragem;
    }
    @Override
    public void ifcNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }
    @Override
    public void calculoImposto() {
        if (this.isGaragem) {
            double imposto = ((this.areaTotal*7.5) + (this.numQuartos*2.5));
            System.out.println("Imposto Cidade de Porto Alegre com Garagem: " + imposto);
        }
        else {
            double imposto = (this.areaTotal*8);
            System.out.println("Imposto Cidade de Porto Alegre sem Garagem: " + imposto);
        }
    }


    // UNUSED
    @Override
    public void ifcNumComodos(int numComodos) {
    }
    @Override
    public void ifcAreaGaragem(int areaGaragem) {
    }
    @Override
    public void ifcIdadeImovel(int idadeImovel) {
    }
}
