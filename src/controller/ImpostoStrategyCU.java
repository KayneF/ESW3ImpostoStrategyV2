package controller;

import model.Curitiba;

public class ImpostoStrategyCU implements IImpostoStrategy {

    private int areaTotal;
    private int idadeImovel;

    @Override
    public void ifcAreaTotal(int areaTotal) {
        this.areaTotal = areaTotal;
    }
    @Override
    public void ifcIdadeImovel(int idadeImovel) {
        this.idadeImovel = idadeImovel;
    }
    @Override
    public void calculoImposto() {
        if(this.idadeImovel > 50) {
            double imposto = (this.areaTotal*5) + (this.idadeImovel*3);
            System.out.println("Imposto Cidade de Curitiba se Imóvel tiver mais que 50 anos: " + imposto);
        }
        else if(this.idadeImovel < 20) {
            double imposto = (this.areaTotal*5) + (this.idadeImovel*2);
            System.out.println("Imposto Cidade de Curitiba se Imóvel tiver menos que 20 anos: " + imposto);
        }
        else if(20 < this.idadeImovel && this.idadeImovel < 50) {
            double imposto = (this.areaTotal*5) + (this.idadeImovel*2.5);
            System.out.println("Imposto Cidade de Curitiba se Imóvel tiver entre 20 e 50 anos: " + imposto);
        }
    }


    // UNUSED
    @Override
    public void ifcNumComodos(int numComodos) {
    }
    @Override
    public void ifcNumQuartos(int numQuartos) {
    }
    @Override
    public void ifcGaragem(boolean isGaragem) {
    }
    @Override
    public void ifcAreaGaragem(int areaGaragem) {
    }
}
