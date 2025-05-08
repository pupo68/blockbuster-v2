import java.util.LinkedList;
import java.util.Queue;

public class FilaDeEspera {
    private final Filme filme; // Referência ao filme associado
    private final Queue<String> filaUsuarios;

    public FilaDeEspera(Filme filme) {
        this.filme = filme;
        this.filaUsuarios = new LinkedList<>();
    }

    public void adicionarNaFila(String usuario) {
        filaUsuarios.add(usuario);
        System.out.println(usuario + " entrou na fila de espera para o filme: " + filme.getTitulo());
    }

    public String removerDaFila() {
        if (filaUsuarios.isEmpty()) {
            System.out.println("A fila de espera para " + filme.getTitulo() + " está vazia!");
            return null;
        }
        String usuario = filaUsuarios.poll();
        System.out.println(usuario + " saiu da fila de espera para " + filme.getTitulo());
        return usuario;
    }

    public void exibirFila() {
        if (filaUsuarios.isEmpty()) {
            System.out.println("Nenhum usuário na fila de espera para " + filme.getTitulo());
            return;
        }
        System.out.println("\n=== FILA DE ESPERA PARA " + filme.getTitulo().toUpperCase() + " ===");
        int posicao = 1;
        for (String usuario : filaUsuarios) {
            System.out.println(posicao + ". " + usuario);
            posicao++;
        }
    }
}