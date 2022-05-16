package model;

public class Curitiba extends Cidade{

    private int idadeImovel;


    public int getIdadeImovel() {
        return idadeImovel;
    }
    public void setIdadeImovel(int idadeImovel) {
        this.idadeImovel = idadeImovel;
    }

    @Override
    public String toString() {
        return "Curitiba{" +
                "idadeMovel=" + idadeImovel +
                '}';
    }
}
