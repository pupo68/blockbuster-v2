// classe criada pra armazenar o motivo da recomendação
public class Motivo {
    private final Filme filme;
    private final String motivo;

    public Motivo(Filme filme, String motivo) {
        this.filme = filme;
        this.motivo = motivo;
    }

    public Filme getFilme() {
        return filme;
    }

    public String getMotivo() {
        return motivo;
    }
}
