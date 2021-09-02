package com.example.endpoits.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController//Determina que esta classe será gerenciada pelo Spring
public class EndPoitsExample {

    //PRIMEIRO TIPO DE  ENDPOINT
    //Este método é chamado apenas com a URL base: localhost:8080
    //porque o GetMapping não tem parâmetros
    @GetMapping
    public String primeiroEnd(){
        return "Primeiro Endpoint Spring";
    }

    //******************************************************************
    //SEGUNDO TIPO DE ENDPOINT
    //Este método é chamado com: localhost:8080/index
    @GetMapping("/index")//Onde index é mapeado pelo GetMapping
    public String segundoEnd(){
        return "Segundo Endpoint Spring";
    }

    //******************************************************************
    //TERCEIRO TIPO DE ENDPOINT - RECEBENDO UM VALOR PELA URI
    //Este método é chamado com: localhost:8080/um_nome_qualquer
    @GetMapping("/{nome}")//nome está entre { } no GetMapping
    //nome será recebido como parâmetro no método terceiroEnd utilizando o @PathVariable
    public String terceiroEnd(@PathVariable String nome){
        return "Eu sou prof "+ nome;
    }

    //******************************************************************
    //QUARTO TIPO DE ENDPOINT - RECEBENDO UM INTEGER PELO REQUESTPARAM
    //Este método é chamado com: localhost:8080/maioridade?idade=40
    //idade será enviada depois do ?
    @GetMapping("/maioridade")
    //idade será recebido como parâmetro no método quartoEnd utilizando o @RequestParam
    public String quartoEnd(@RequestParam Integer idade){
        if(idade>=18){
            return "Já sou maior de idade";
        }else{
            return "Ainda não sou maior de idade";
        }
    }

    //IMPORTANTE: Cada um destes exemplos pode ser implementado para qualquer tipo de dado (String, Integer, Double...)





}
