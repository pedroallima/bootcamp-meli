package com.meli;

public class Banco extends Transacao{
    //Depósito, Transferência, Retirada de Dinheiro, Consulta de Saldo, Pagamento deServiços.

    public boolean deposito(String cliente){
        if(cliente.equals("Executivo")){
            return transactionOk();
        }else{
            return transactionNoOk();
        }
    }

    public boolean transferencia(String cliente){
        if(cliente.equals("Executivo")){
            return transactionOk();
        }else{
            return transactionNoOk();
        }
    }

    public boolean retirada(String cliente){
        if(cliente.equals("basico") || cliente.equals("Coletores")){
            return transactionOk();
        }else{
            return transactionNoOk();
        }
    }

    public boolean consultaSaldo(String cliente){
        if(cliente.equals("Basico") || cliente.equals("Coletores")){
            return transactionOk();
        }else{
            return transactionNoOk();
        }
    }

    public boolean pagamentoDeServicos(String cliente){
        if(cliente.equals("Basico")){
            return transactionOk();
        }else{
            return transactionNoOk();
        }
    }
}
