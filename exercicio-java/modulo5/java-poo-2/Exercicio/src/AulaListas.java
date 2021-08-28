import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AulaListas {

    public static void main(String[] args) {

        Categoria pequenoCircuito = new Categoria("pequenoCircuito", 1, 2, new String[]{"Riacho", "Selva"}, 1300, 1500, true);
        Categoria circuitoMedio = new Categoria("circuitoMedio", 2, 5, new String[]{"Selva", "Riacho", "Lama"}, 2000, 2300, true);
        Categoria circuitoAvancado = new Categoria("circuitoAvancado", 3, 10, new String[]{"Selva", "Riacho", "Lama", "Escalada em rocha"}, 0, 2800, false);

        Participante participanteMaiorDeIdade = new Participante(
                "rg", "teste", "sobrenome teste", 30,
                "contato Celular", "contato emergencia",
                "A"
        );
        Participante participanteMenorDeIdade = new Participante(
                "rg", "teste juvenil", "sobrenome teste juvenil", 17,
                "contato Celular", "contato emergencia",
                "A"
        );

        Aplicativo app = new Aplicativo();

        app.registrarParticipante(participanteMaiorDeIdade, circuitoAvancado);
        app.registrarParticipante(participanteMenorDeIdade, circuitoAvancado);

        // mostra os participantes
        app.printarParticipantes(circuitoAvancado);

        // remove
        app.removerParticipante(circuitoAvancado.nome, participanteMenorDeIdade.inscricao);
        app.removerParticipante(circuitoAvancado.nome, participanteMaiorDeIdade.inscricao);

        app.printarParticipantes(pequenoCircuito);
    }
}

class Aplicativo {
    HashMap<String, ArrayList<Integer>> controle;

    public void removerParticipante(String nomeCategoria, Integer participanteId) {
        if (controle != null && controle.containsKey(nomeCategoria)) {
            ArrayList<Integer> participantesDaCategoria = controle.get(nomeCategoria);
            participantesDaCategoria.removeIf(e -> {
                return e == participanteId;
            });
            System.out.println("Participante excluido: " + participanteId.toString());
        }
    }

    public void registrarParticipante(Participante participante, Categoria categoria) {
        if (participante.inscricao != null) {
            System.out.println("Participante ja cadastrado");
            return;
        }

        if (!participante.ehMaiorDeIdade() && !categoria.permiteMenorDeIdade) {
            System.out.println("AQUI NAO PODE JUVENIL PARCA, so os brabo");
            return;
        }

        // o controle ja foi iniciado? se não, inicia
        if (controle == null) {
            controle = new HashMap<String, ArrayList<Integer>>() {};
        }

        // ja foi criada a categoria?
        // se nao:
        if (!controle.containsKey(categoria.nome)) {
            participante.inscricao = 1;
            controle.put(categoria.nome, new ArrayList<>() { { add(participante.inscricao); } });
        } else { // se sim
            ArrayList<Integer> participantesDaCategoria = controle.get(categoria.nome);
            Integer novaInscricao = participantesDaCategoria.size() + 1;
            participante.inscricao = novaInscricao;
            participantesDaCategoria.add(participante.inscricao);
        }
    }

    public void printarParticipantes(Categoria categoria) {
        System.out.print("Categoria: " + categoria.nome);
        System.out.print("Participantes: ");
        List<Integer> participantesDaCategoria = controle.get(categoria.nome);
        if (participantesDaCategoria != null) {
            for (int i = 0; i < participantesDaCategoria.size(); i++) {
                System.out.print(participantesDaCategoria.get(i).toString() + " ");
            }
        }
        System.out.println("");
    }
}

class Categoria {
    public final String nome;
    public final int id;
    public final int distancia;
    public final String[] percurssos;
    public final double precoMenorDeIdade;
    public final double preco;
    public final boolean permiteMenorDeIdade;

    public Categoria(
            String nome,
            int id,
            int distancia,
            String[] percurssos,
            double precoMenorDeIdade,
            double preco,
            boolean permiteMenorDeIdade) {
        this.nome = nome;
        this.id = id;
        this.distancia = distancia;
        this.percurssos = percurssos;
        this.precoMenorDeIdade = precoMenorDeIdade;
        this.preco = preco;
        this.permiteMenorDeIdade = permiteMenorDeIdade;
    }
}

class Participante {
    public Integer inscricao;
    public final String rg;
    public final String nome;
    public final String sobrenome;
    public final int idade;
    public final String contatoCelular;
    public final String contatoEmergencia;
    public final String grupoSanguineo;

    public Participante(String rg, String nome, String sobrenome, int idade, String contatoCelular, String contatoEmergencia, String grupoSanguineo) {
        this.rg = rg;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.contatoCelular = contatoCelular;
        this.contatoEmergencia = contatoEmergencia;
        this.grupoSanguineo = grupoSanguineo;
    }

    public boolean ehMaiorDeIdade() {
        return this.idade >= 18;
    }
}
