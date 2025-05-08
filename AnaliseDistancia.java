import java.util.List;
import java.util.Map;

public class AnaliseDistancia {

public static void exibirDistancias(Filme origem, Map<Filme, Integer> distancias) {
    System.out.println("\n---- Distâncias a partir de " + origem.getTitulo() + " ----");
    
    List<Map.Entry<Filme, Integer>> entradasOrdenadas = distancias.entrySet().stream()
        .filter(e -> !e.getKey().equals(origem))
        .sorted(Ordenacao.porDistanciaETitulo())
        .toList();
    
    int posicao = 1;
    for (Map.Entry<Filme, Integer> entrada : entradasOrdenadas) {
        Filme filme = entrada.getKey();
        int distancia = entrada.getValue();
        
        // Determinar o motivo (diretor ou gênero)
        String motivo = "";
        if (filme.getDiretor().equals(origem.getDiretor())) {
            motivo = "diretor";
        } else if (filme.getGenero().equals(origem.getGenero())) {
            motivo = "gênero";
        }
        
        System.out.printf("%d. %s | Motivo: %s | Distância: %d%n",
                          posicao,
                          filme.getTitulo(),
                          motivo.isEmpty() ? "nenhum" : motivo, // se nenhum motivo
                          distancia);
        posicao++;
    }
}

    public static void exibirDistanciasDoHistorico(Usuario usuario, RecomendacoesFilmes grafo) {
        System.out.println("\nAnálise de distâncias a partir do histórico:");
        
        usuario.getHistorico().getPilhaHistorico().forEach(filme -> {
            Map<Filme, Integer> distancias = grafo.calcularDistancias(filme);
            exibirDistancias(filme, distancias);
        });
    }
}