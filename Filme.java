public class Filme {
    private final String titulo;
    private final String diretor;
    private final int ano;
    private final String genero;

    public Filme(String titulo, String diretor, int ano, String genero) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.ano = ano;
        this.genero = genero;
    }

    // Getters
    public String getTitulo() { return titulo; }
    public String getDiretor() { return diretor; }
    public int getAno() { return ano; }
    public String getGenero() { return genero; }

    @Override
    public String toString() {
        return titulo + " (" + diretor + ", " + ano + ", " + genero + ")";
    }
}