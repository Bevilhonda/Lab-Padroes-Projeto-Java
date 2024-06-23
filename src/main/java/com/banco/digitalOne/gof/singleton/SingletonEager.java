package com.banco.digitalOne.gof.singleton;
/*
Singleton apressado
 */
public class SingletonEager {

    private static final SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }
    public static SingletonEager getInstancia(){

        return instancia;
    }
}


