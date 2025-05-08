import java.util.*;
/**
 * Gera recomendações baseadas no histórico de navegação do usuário.
 * Prioriza filmes do mesmo diretor, depois do mesmo gênero, ordenando por distância.
 */
public class RecomendacoesFilmes {
    private final Map<Filme, Set<Filme>> grafo = new HashMap<>();

    //conexão bidirecional
    public void adicionarConexao(Filme filme1, Filme filme2) {
        grafo.putIfAbsent(filme1, new HashSet<>());
        grafo.putIfAbsent(filme2, new HashSet<>());
        grafo.get(filme1).add(filme2);
        grafo.get(filme2).add(filme1);
    }
    // metodo de calcular distancia chamando a class do algoritmo
    public Map<Filme, Integer> calcularDistancias(Filme origem) {
        return AlgoritmoDijkstra.bfs(this.grafo, origem);
    }
    // Gera recomendações baseadas no histórico do usuário
    public List<Motivo> gerarRecomendacoes(HistoricoNavegacao historicoUsuario) {
        Set<Filme> jaRecomendados = new HashSet<>();
        Stack<Filme> historico = historicoUsuario.getPilhaHistorico();
        List<Motivo> recomendacoes = new ArrayList<>();
        Map<Filme, Integer> distanciasConsolidadas = new HashMap<>();
    
        // 1. Calcular distâncias para todos os filmes do histórico
        for (Filme filmeHistorico : historico) {
            Map<Filme, Integer> distancias = calcularDistancias(filmeHistorico);
            distancias.forEach((filme, distancia) -> {
                if (!distanciasConsolidadas.containsKey(filme) || distancia < distanciasConsolidadas.get(filme)) {
                    distanciasConsolidadas.put(filme, distancia);
                }
            });
        }
    
        // 2. Gerar recomendações com motivos
        for (Filme filmeHistorico : historico) {
            if (grafo.containsKey(filmeHistorico)) {
                for (Filme filmeRelacionado : grafo.get(filmeHistorico)) {
                    if (!historico.contains(filmeRelacionado) && !jaRecomendados.contains(filmeRelacionado)) {
                        jaRecomendados.add(filmeRelacionado);
                        
                        String motivo = "";
                        if (filmeHistorico.getDiretor().equals(filmeRelacionado.getDiretor())) {
                            motivo = "diretor";
                        } else if (filmeHistorico.getGenero().equals(filmeRelacionado.getGenero())) {
                            motivo = "gênero";
                        }
                        
                        if (!motivo.isEmpty()) {
                            recomendacoes.add(new Motivo(
                                filmeRelacionado, 
                                motivo + " | Distância: " + distanciasConsolidadas.get(filmeRelacionado)
                            ));
                        }
                    }
                }
            }
        }
    
        // 3. Ordenar por menor distância e maior relevância
        recomendacoes.sort((a, b) -> {
            int distA = distanciasConsolidadas.get(a.getFilme());
            int distB = distanciasConsolidadas.get(b.getFilme());
            
            boolean aIsDirector = a.getMotivo().startsWith("diretor");
            boolean bIsDirector = b.getMotivo().startsWith("diretor");
            boolean aIsGenero = a.getMotivo().startsWith("gênero");
            boolean bIsGenero = b.getMotivo().startsWith("gênero");
            
            // Prioridade 1: Diretor
            if (aIsDirector && !bIsDirector) return -1;
            if (!aIsDirector && bIsDirector) return 1;
            
            // Prioridade 2: Gênero (se ambos não são diretor)
            if (aIsGenero && !bIsGenero) return -1;
            if (!aIsGenero && bIsGenero) return 1;
            
            // Prioridade 3: Menor distância
            return Integer.compare(distA, distB);
        });
    
        return recomendacoes;
    }

    public static List<Motivo> getTop3Recomendacoes(List<Motivo> recomendacoes) {
        int limite = Math.min(3, recomendacoes.size());
        return recomendacoes.subList(0, limite);
    }

    public static void exibirTop3(List<Motivo> top3) {
        System.out.println("\nTop 3 recomendações:");
        for(int i = 0; i < top3.size(); i++) {
            Motivo rec = top3.get(i);
            System.out.println((i+1) + ". " + rec.getFilme().getTitulo() + 
                             " | Motivo: " + rec.getMotivo());
        }
    }

    // Exibe o grafo (para depuração)
    public void exibirGrafo() {
        System.out.println("\n=== Estrutura do Grafo ===");
        for (Filme filme : grafo.keySet()) {
            System.out.println("Filme: " + filme.getTitulo());
            System.out.println("Conectado a:");
            for (Filme conexao : grafo.get(filme)) {
                System.out.println(" - " + conexao.getTitulo());
            }
        }
    }

}