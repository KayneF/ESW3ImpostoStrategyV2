package model;

public class PortoAlegreBuilder {

    private PortoAlegre pa;

    public PortoAlegreBuilder(){
        this.pa = new PortoAlegre();
    }
    public static PortoAlegreBuilder builder(){
        return new PortoAlegreBuilder();
    }

    // -----------------------------------------------------

    public PortoAlegreBuilder addAreaTotal(int areaTotal){
        this.pa.setAreaTotal(areaTotal);
        return this;
    }
    public PortoAlegreBuilder addGaragem(boolean garagem){
        this.pa.setGaragem(garagem);
        return this;
    }
    public PortoAlegreBuilder addAreaGaragem(int areaGaragem){
        this.pa.setAreaGaragem(areaGaragem);
        return this;
    }

    // -----------------------------------------------------

    public PortoAlegre get(){
        this.pa.setAreaTotal(this.pa.getAreaTotal());
        this.pa.setGaragem(this.pa.isGaragem());
        this.pa.setAreaGaragem(this.pa.getAreaGaragem());
        return this.pa;
    }
}
