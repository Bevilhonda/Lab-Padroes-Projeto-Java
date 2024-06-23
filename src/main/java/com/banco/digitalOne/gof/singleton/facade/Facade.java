package com.banco.digitalOne.gof.singleton.facade;

import com.banco.subSistema1Crm.CrmService;
import com.banco.subSistema2Cep.CepApi;

public class Facade {

    public void migrarCliente(String nome , String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstatdo(cep);

        CrmService.gravarCliente(nome,cep,cidade,estado);

    }

}
