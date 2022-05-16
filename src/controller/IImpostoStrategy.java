package controller;

public interface IImpostoStrategy {

    void ifcAreaTotal(int areaTotal);
    void ifcNumComodos(int numComodos);
    void ifcNumQuartos(int numQuartos);
    void ifcGaragem(boolean isGaragem);
    void ifcAreaGaragem(int areaGaragem);
    void ifcIdadeImovel(int idadeImovel);
    void calculoImposto();

}
