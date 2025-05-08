// classe criada para armazenar o historico de cada usuario
public class Usuario {
    private final String nome;
    private final HistoricoNavegacao historico;

    public Usuario(String nome) {
        this.nome = nome;
        this.historico = new HistoricoNavegacao();
    }
    // get
    public String getNome() {
        return nome;
    }

    public HistoricoNavegacao getHistorico() {
        return historico;
    } 
}
