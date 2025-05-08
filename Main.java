import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Criação dos filmes
        Filme filme1 = new Filme("Interestelar", "Christopher Nolan", 2014, "Ficção Científica");
        Filme filme2 = new Filme("O Poderoso Chefão", "Francis Ford Coppola", 1972, "Drama");
        Filme filme3 = new Filme("Clube da Luta", "David Fincher", 1999, "Drama");
        Filme filme4 = new Filme("Matrix", "Lana e Lilly Wachowski", 1999, "Ficção Científica");
        Filme filme5 = new Filme("A Origem", "Christopher Nolan", 2010, "Ficção Científica");
        Filme filme6 = new Filme("Apocalypse Now", "Francis Ford Coppola", 1979, "Guerra");
        Filme filme7 = new Filme("Seven: Os Sete Crimes Capitais", "David Fincher", 1995, "Suspense");
        Filme filme8 = new Filme("Blade Runner 2049", "Denis Villeneuve", 2017, "Ficção Científica");
        Filme filme9 = new Filme("O Resgate do Soldado Ryan", "Steven Spielberg", 1998, "Guerra");
        Filme filme10 = new Filme("Gladiador", "Ridley Scott", 2000, "Ação");
        Filme filme11 = new Filme("Mad Max: Estrada da Fúria", "George Miller", 2015, "Ação");
        Filme filme12 = new Filme("Psicose", "Alfred Hitchcock", 1960, "Suspense");

        // Criação dos usuários
        Map<String, Usuario> usuarios = new HashMap<>();
        usuarios.put("Alcileudo", new Usuario("Alcileudo"));
        usuarios.put("Gustavo", new Usuario("Gustavo"));
        usuarios.put("Pupo", new Usuario("Pupo"));

        // Construção do histórico
        // Alcileudo
        usuarios.get("Alcileudo").getHistorico().adicionarAoHistorico(filme9);  // O Resgate do Soldado Ryan
        usuarios.get("Alcileudo").getHistorico().adicionarAoHistorico(filme4);   // Matrix
        usuarios.get("Alcileudo").getHistorico().adicionarAoHistorico(filme1);   // Interestelar
        usuarios.get("Alcileudo").getHistorico().adicionarAoHistorico(filme12);  // Psicose

        // Gustavo
        usuarios.get("Gustavo").getHistorico().adicionarAoHistorico(filme2);    // O Poderoso Chefão
        usuarios.get("Gustavo").getHistorico().adicionarAoHistorico(filme11);   // Mad Max
        usuarios.get("Gustavo").getHistorico().adicionarAoHistorico(filme10);   // Gladiador
        usuarios.get("Gustavo").getHistorico().adicionarAoHistorico(filme5);    // A origem

        // Configuração do grafo de recomendações
        RecomendacoesFilmes grafo = new RecomendacoesFilmes();
        
        // Conexões por diretor
        grafo.adicionarConexao(filme1, filme5);  // Christopher Nolan
        grafo.adicionarConexao(filme2, filme6);  // Francis Ford Coppola
        grafo.adicionarConexao(filme3, filme7);  // David Fincher
        
        // Conexões por gênero
        grafo.adicionarConexao(filme1, filme4);  // Ficção Científica
        grafo.adicionarConexao(filme1, filme8);  // Ficção Científica
        grafo.adicionarConexao(filme4, filme8);  // Ficção Científica
        grafo.adicionarConexao(filme6, filme9);   // Guerra
        grafo.adicionarConexao(filme10, filme11); // Ação
        grafo.adicionarConexao(filme7, filme12);  // Suspense
        grafo.adicionarConexao(filme2, filme3);   // Drama
        // ========== DEMONSTRAÇÃO DO GRAFO ==========
        System.out.println("\n========== ESTRUTURA DO GRAFO ==========");
        grafo.exibirGrafo();

        // ========== DEMONSTRAÇÃO ATUALIZADA ==========
        System.out.println("\n========== SISTEMA DE RECOMENDAÇÃO INTELIGENTE ==========");

        // Demonstração para Alcileudo
        System.out.println("\n----- USUÁRIO: ALCILEUDO -----");
        usuarios.get("Alcileudo").getHistorico().exibirHistorico();
        
        List<Motivo> recAlcileudo = grafo.gerarRecomendacoes(usuarios.get("Alcileudo").getHistorico());
        RecomendacoesFilmes.exibirTop3(RecomendacoesFilmes.getTop3Recomendacoes(recAlcileudo));
        AnaliseDistancia.exibirDistanciasDoHistorico(usuarios.get("Alcileudo"), grafo);

        // Demonstração para Gustavo
        System.out.println("\n----- USUÁRIO: GUSTAVO -----");
        usuarios.get("Gustavo").getHistorico().exibirHistorico();
        
        List<Motivo> recGustavo = grafo.gerarRecomendacoes(usuarios.get("Gustavo").getHistorico());
        RecomendacoesFilmes.exibirTop3(RecomendacoesFilmes.getTop3Recomendacoes(recGustavo));
        AnaliseDistancia.exibirDistanciasDoHistorico(usuarios.get("Gustavo"), grafo);

        // Demonstração completa do Dijkstra
        System.out.println("\n========== DEMONSTRAÇÃO COMPLETA DO DIJKSTRA ==========");
        List<Filme> catalogo = Arrays.asList(filme1, filme2, filme3, filme4, filme5, filme6, 
                                           filme7, filme8, filme9, filme10, filme11, filme12);
        catalogo.forEach(filme -> AnaliseDistancia.exibirDistancias(filme, grafo.calcularDistancias(filme)));
    }
}