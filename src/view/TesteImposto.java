package view;

import controller.*;
import model.*;

public class TesteImposto {

    public static void main(String[] args) {

        SaoPaulo sp = SaoPauloBuilder.builder()
                .addAreaTotal(75)
                .addComodos(4)
                .get();
//
        BeloHorizonte bh = BeloHorizonteBuilder.builder()
                .addAreaTotal(120)
                .addQuartos(3)
                .get();

        PortoAlegre pa = PortoAlegreBuilder.builder()
                .addAreaTotal(95)
                .addGaragem(true)
                .addAreaGaragem(20)
                .get();

        Curitiba cu = CuritibaBuilder.builder()
                .addAreaTotal(100)
                .addIdadeImovel(15)
                .get();

        IImpostoStrategy imposto;

        imposto = new ImpostoStrategySP();
        imposto.ifcAreaTotal(sp.getAreaTotal());
        imposto.ifcNumComodos(sp.getNumComodos());
        imposto.calculoImposto();

        imposto = new ImpostoStrategyBH();
        imposto.ifcAreaTotal(bh.getAreaTotal());
        imposto.ifcNumQuartos(bh.getNumQuartos());
        imposto.calculoImposto();

        imposto = new ImpostoStrategyPA();
        imposto.ifcAreaTotal(pa.getAreaTotal());
        imposto.ifcGaragem(pa.isGaragem());
        imposto.ifcAreaGaragem(pa.getAreaGaragem());
        imposto.calculoImposto();

        imposto = new ImpostoStrategyCU();
        imposto.ifcAreaTotal(cu.getAreaTotal());
        imposto.ifcIdadeImovel(cu.getIdadeImovel());
        imposto.calculoImposto();

    }
}
