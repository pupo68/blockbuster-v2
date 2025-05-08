import java.util.Stack;

public class HistoricoNavegacao {
    private final Stack<Filme> pilhaHistorico;
    public Stack<Filme> getPilhaHistorico() {
        return pilhaHistorico;
    }

    public HistoricoNavegacao() {
        pilhaHistorico = new Stack<>();
    }

    // Método renomeado para refletir filmes
    public void adicionarAoHistorico(Filme filme) {
        pilhaHistorico.push(filme);
    }

    public Filme removerDoHistorico() {
        if (pilhaHistorico.isEmpty()) {
            System.out.println("Histórico vazio!");
            return null;
        }
        Filme filme = pilhaHistorico.pop();
        return filme;
    }

    public void exibirHistorico() {
        if (pilhaHistorico.isEmpty()) {
            System.out.println("Nenhum filme no histórico.");
            return;
        }
        System.out.println("----- Histórico de Navegação (Filmes) -----");
        int posicao = 1;
        for (Filme filme : pilhaHistorico) {
            System.out.println(posicao + ". " + filme);
            posicao++;
        }
    }
}