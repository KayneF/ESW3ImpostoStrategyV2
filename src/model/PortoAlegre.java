package model;

public class PortoAlegre extends Cidade{

    private boolean garagem;
    private int areaGaragem;

    public boolean isGaragem() {
        return garagem;
    }
    public void setGaragem(boolean garagem) {
        this.garagem = garagem;
    }
    public int getAreaGaragem() {
        return areaGaragem;
    }
    public void setAreaGaragem(int areaGaragem) {
        this.areaGaragem = areaGaragem;
    }

    @Override
    public String toString() {
        return "PortoAlegre{" +
                "garagem=" + garagem +
                ", areaGaragem=" + areaGaragem +
                '}';
    }
}
