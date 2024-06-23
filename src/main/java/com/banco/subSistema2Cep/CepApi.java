package com.banco.subSistema2Cep;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }
    public static CepApi getInstancia(){

        return instancia;
    }

    public String  recuperarCidade(String cep){
        return "Araraquara";

    }

    public String recuperarEstatdo(String  estado){
        return "Sp";
    }
}
