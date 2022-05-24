package model;

public abstract class Cidade {

    private int areaTotal;


    public int getAreaTotal() {
        return areaTotal;
    }
    public void setAreaTotal(int areaTotal) {
        this.areaTotal = areaTotal;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "areaTotal=" + areaTotal +
                '}';
    }
}
