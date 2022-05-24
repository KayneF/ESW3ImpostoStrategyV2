package view;

import controller.*;
import model.*;

public class TesteImposto {

    public static void main(String[] args) {

        SaoPaulo sp = SaoPauloBuilder.builder()
                .addAreaTotal(75)
                .addComodos(5)
                .get();

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


        InterfaceNumComodos isp;
        isp = new ImpostoStrategySP();
        isp.ifcAreaTotal(sp.getAreaTotal());
        isp.ifcNumComodos(sp.getNumComodos());
        isp.ifcCalculoImposto();

        InterfaceNumQuartos ibh;
        ibh = new ImpostoStrategyBH();
        ibh.ifcAreaTotal(bh.getAreaTotal());
        ibh.ifcNumQuartos(bh.getNumQuartos());
        ibh.ifcCalculoImposto();

        InterfaceGaragem ipa;
        ipa = new ImpostoStrategyPA();
        ipa.ifcAreaTotal(pa.getAreaTotal());
        ipa.ifcGaragem(pa.isGaragem());
        ipa.ifcAreaGaragem(pa.getAreaGaragem());
        ipa.ifcCalculoImposto();

        InterfaceIdadeImovel icu;
        icu = new ImpostoStrategyCU();
        icu.ifcAreaTotal(cu.getAreaTotal());
        icu.ifcIdadeImovel(cu.getIdadeImovel());
        icu.ifcCalculoImposto();
    }
}