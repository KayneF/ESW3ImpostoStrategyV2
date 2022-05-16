package model;

public class SaoPaulo extends Cidade{

    private int numComodos;


    public int getNumComodos() {
        return numComodos;
    }
    public void setNumComodos(int numComodos) {
        this.numComodos = numComodos;
    }

    @Override
    public String toString() {
        return "SaoPaulo{" +
                "comodos=" + numComodos +
                '}';
    }
}
