package controller;

public class ImpostoStrategyPA implements InterfaceGaragem {

    private int areaTotal;
    private boolean isGaragem;
    private int areaGaragem;

    @Override
    public void ifcAreaTotal(int areaTotal) {
        this.areaTotal = areaTotal;
    }
    @Override
    public void ifcGaragem(boolean isGaragem) {
        this.isGaragem = isGaragem;
    }
    @Override
    public void ifcAreaGaragem(int areaGaragem) {
        this.areaGaragem = areaGaragem;
    }

    @Override
    public void ifcCalculoImposto() {
        if (this.isGaragem) {
            double imposto = ((this.areaTotal*7.5) + (this.areaGaragem*2.5));
            System.out.println("Imposto Cidade de Porto Alegre com Garagem: " + imposto);
        }
        else {
            double imposto = (this.areaTotal*8);
            System.out.println("Imposto Cidade de Porto Alegre sem Garagem: " + imposto);
        }
    }
}