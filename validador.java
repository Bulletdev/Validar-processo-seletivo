import java.util.ArrayList;
import java.util.List;

class Candidato {
    String nome;
    int idade;
    double notaTeste;

    public Candidato(String nome, int idade, double notaTeste) {
        this.nome = nome;
        this.idade = idade;
        this.notaTeste = notaTeste;
    }

    public boolean isAprovado() {
        return idade >= 18 && notaTeste >= 7.0;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Nota: " + notaTeste;
    }
}

public class ProcessoSeletivo {

    public static void main(String[] args) {
        List<Candidato> candidatos = new ArrayList<>();
        candidatos.add(new Candidato("Alice", 22, 8.5));
        candidatos.add(new Candidato("Bruno", 17, 6.5));
        candidatos.add(new Candidato("Carlos", 19, 7.2));
        candidatos.add(new Candidato("Diana", 21, 9.0));
        candidatos.add(new Candidato("Eduardo", 16, 7.8));

        List<Candidato> selecionados = selecionarCandidatos(candidatos);
        imprimirSelecionados(selecionados);
        fazerLigacoes(selecionados);
    }

    public static List<Candidato> selecionarCandidatos(List<Candidato> candidatos) {
        List<Candidato> selecionados = new ArrayList<>();
        for (Candidato candidato : candidatos) {
            if (candidato.isAprovado()) {
                selecionados.add(candidato);
            }
        }
        return selecionados;
    }

    public static void imprimirSelecionados(List<Candidato> selecionados) {
        System.out.println("Candidatos Selecionados:");
        for (Candidato candidato : selecionados) {
            System.out.println(candidato);
        }
    }

    public static void fazerLigacoes(List<Candidato> selecionados) {
        System.out.println("\nFazendo ligações para os candidatos selecionados:");
        for (Candidato candidato : selecionados) {
            System.out.println("Ligando para " + candidato.nome + "...");
        }
    }
}
