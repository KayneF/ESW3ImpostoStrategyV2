package model;

public class CuritibaBuilder {

    private Curitiba cu;

    public CuritibaBuilder(){
        this.cu = new Curitiba();
    }
    public static CuritibaBuilder builder(){
        return new CuritibaBuilder();
    }

    // -----------------------------------------------------

    public CuritibaBuilder addAreaTotal(int areaTotal){
        this.cu.setAreaTotal(areaTotal);
        return this;
    }
    public CuritibaBuilder addIdadeImovel(int idadeImovel){
        this.cu.setIdadeImovel(idadeImovel);
        return this;
    }

    // -----------------------------------------------------

    public Curitiba get(){
        this.cu.setAreaTotal(this.cu.getAreaTotal());
        this.cu.setIdadeImovel(this.cu.getIdadeImovel());
        return this.cu;
    }
}
