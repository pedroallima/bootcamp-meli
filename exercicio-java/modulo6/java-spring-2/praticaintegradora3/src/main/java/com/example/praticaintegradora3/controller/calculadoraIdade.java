package com.example.praticaintegradora3.controller;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.Calendar;

@RestController
public class calculadoraIdade {
    Calendar calendario = Calendar.getInstance();

    @GetMapping("/{dia}/{mes}/{ano}")
    public Integer data(@PathVariable Integer dia, @PathVariable Integer mes, @PathVariable Integer ano) {
        int diaAtual = calendario.get(Calendar.DAY_OF_MONTH);
        int mesAtual = (calendario.get(Calendar.MONTH) + 1);
        int anoAtual = calendario.get(Calendar.YEAR);
        int idade;

        if (mes < mesAtual) {
            idade = anoAtual - ano;
        }
        else if (mes == mesAtual) {
            if (dia <= diaAtual) {
                idade = anoAtual - ano ;
            }else {
                idade = anoAtual-ano-1;
            }
        } else {
            idade = anoAtual - ano - 1;
        }
        return idade;
    }
}