package com.banco.digitalOne.gof.singleton.strategy;

public class ComportamentoDefensivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente....");

    }
}
