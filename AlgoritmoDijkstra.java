import java.util.*;

public class AlgoritmoDijkstra {
    
    public static Map<Filme, Integer> bfs(Map<Filme, Set<Filme>> grafo, Filme origem) {
        Map<Filme, Integer> distancias = new HashMap<>();
        Queue<Filme> fila = new LinkedList<>();

        distancias.put(origem, 0);
        fila.add(origem);

        while (!fila.isEmpty()) {
            Filme atual = fila.poll();
            int distanciaAtual = distancias.get(atual);

            for (Filme vizinho : grafo.getOrDefault(atual, new HashSet<>())) {
                if (!distancias.containsKey(vizinho)) {
                    distancias.put(vizinho, distanciaAtual + 1);
                    fila.add(vizinho);
                }
            }
        }
        return distancias;
    }
}