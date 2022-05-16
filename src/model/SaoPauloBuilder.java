package model;

public class SaoPauloBuilder {

    private SaoPaulo sp;

    // BUILDER
    public SaoPauloBuilder(){
        this.sp = new SaoPaulo();
    }
    public static SaoPauloBuilder builder(){
        return new SaoPauloBuilder();
    }

    // -----------------------------------------------------

    public SaoPauloBuilder addAreaTotal(int areaTotal){
        this.sp.setAreaTotal(areaTotal);
        return this;
    }
    public SaoPauloBuilder addComodos(int numComodos){
        this.sp.setNumComodos(numComodos);
        return this;
    }

    // -----------------------------------------------------

    public SaoPaulo get(){
        this.sp.setAreaTotal(this.sp.getAreaTotal());
        this.sp.setNumComodos(this.sp.getNumComodos());
        return this.sp;
    }
}
