package model;

public class BeloHorizonte extends Cidade{

    private int numQuartos;


    public int getNumQuartos() {
        return numQuartos;
    }
    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }

    @Override
    public String toString() {
        return "BeloHorizonte{" +
                "quartos=" + numQuartos +
                '}';
    }
}
