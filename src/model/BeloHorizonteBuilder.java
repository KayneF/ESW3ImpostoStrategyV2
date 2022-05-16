package model;

public class BeloHorizonteBuilder {

    private BeloHorizonte bh;

    // BUILDER
    public BeloHorizonteBuilder(){
        this.bh = new BeloHorizonte();
    }
    public static BeloHorizonteBuilder builder(){
        return new BeloHorizonteBuilder();
    }

    // -----------------------------------------------------

    public BeloHorizonteBuilder addAreaTotal(int areaTotal){
        this.bh.setAreaTotal(areaTotal);
        return this;
    }
    public BeloHorizonteBuilder addQuartos(int quartos){
        this.bh.setNumQuartos(quartos);
        return this;
    }

    // -----------------------------------------------------

    public BeloHorizonte get(){
        this.bh.setAreaTotal(this.bh.getAreaTotal());
        this.bh.setNumQuartos(this.bh.getNumQuartos());
        return this.bh;
    }
}
