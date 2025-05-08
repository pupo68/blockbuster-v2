import java.util.Comparator;
import java.util.Map;

public class Ordenacao {
    
    public static Comparator<Map.Entry<Filme, Integer>> porDistanciaETitulo() {
        return Comparator
            .comparingInt(Map.Entry<Filme, Integer>::getValue)
            .thenComparing(entry -> entry.getKey().getTitulo());
    }
}