package modelo;

import java.util.ArrayList;
import java.util.List;

public class ListaSeries {
    private List<String> seriesLeo;
    public ListaSeries(){
        this.seriesLeo = new ArrayList<>();
    }
    public void adicionarSerieLeo(String filme){
        seriesLeo.add(filme);
    }
    public void mostrarSeriesLeo() {
        System.out.println("Filmes disponíveis:");
        for (int i = 0; i < seriesLeo.size(); i++) {
            System.out.println((i + 1) + ". " + seriesLeo.get(i));
        }
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Lista de Filmes:\n");
        for (String filme : seriesLeo) {
            builder.append(filme).append("\n");
        }
        return builder.toString();
    }
}