package com.banco;

import com.banco.digitalOne.gof.singleton.SingletonEager;
import com.banco.digitalOne.gof.singleton.SingletonLazy;
import com.banco.digitalOne.gof.singleton.SingletonLazyHolder;
import com.banco.digitalOne.gof.singleton.facade.Facade;
import com.banco.digitalOne.gof.singleton.strategy.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*
        Testes relacionados ao design pattern SINGLETON.
         */

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);


        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);


        /*
        Testes relacionados ao design pattern STRATEGY.
         */

        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();


        /*
        Testes relacionados ao design pattern FACADE.
         */

        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "87040440");




    }
}