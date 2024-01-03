package modelo;

import java.util.ArrayList;
import java.util.List;

public class ListaFilmesManuela {
    private List<String> filmesManuela;
    public ListaFilmesManuela(){
        this.filmesManuela = new ArrayList<>();
    }
    public void adicionarFilmeManu(String filme){
        filmesManuela.add(filme);
    }
    public void mostrarFilmesManu() {
        System.out.println("Filmes disponíveis:");
        for (int i = 0; i < filmesManuela.size(); i++) {
            System.out.println((i + 1) + ". " + filmesManuela.get(i));
        }
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Lista de Filmes:\n");
        for (String filme : filmesManuela) {
            builder.append(filme).append("\n");
        }
        return builder.toString();
    }
}
