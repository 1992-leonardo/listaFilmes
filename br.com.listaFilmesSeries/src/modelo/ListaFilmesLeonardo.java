package modelo;

import java.util.ArrayList;
import java.util.List;

public class ListaFilmesLeonardo {
    private List<String> filmesLeonardo;
    public ListaFilmesLeonardo(){
        this.filmesLeonardo = new ArrayList<>();
    }
    public void adicionarFilmeLeo(String filme){
        filmesLeonardo.add(filme);
    }
    public void mostrarFilmesLeo() {
        System.out.println("Filmes disponíveis:");
        for (int i = 0; i < filmesLeonardo.size(); i++) {
            System.out.println((i + 1) + ". " + filmesLeonardo.get(i));
        }
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Lista de Filmes:\n");
        for (String filme : filmesLeonardo) {
            builder.append(filme).append("\n");
        }
        return builder.toString();
    }
}