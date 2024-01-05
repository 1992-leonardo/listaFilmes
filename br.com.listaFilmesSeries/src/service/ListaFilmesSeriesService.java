package service;

import modelo.ListaFilmesLeonardo;
import modelo.ListaFilmesManuela;
import modelo.ListaSeries;

public class ListaFilmesSeriesService {
    public static void main(String[] args) {

        //Criando minha lista de filmes.
        ListaFilmesLeonardo listaFilmesLeonardo = new ListaFilmesLeonardo();
        listaFilmesLeonardo.adicionarFilmeLeo("John Wick");
        listaFilmesLeonardo.adicionarFilmeLeo("O Protetor");
        listaFilmesLeonardo.adicionarFilmeLeo("Desejo de Matar ");
        listaFilmesLeonardo.mostrarFilmesLeo();

        //Uma quebra de linha.
        System.out.println();

      // Criando minha lista de serie
        ListaSeries listaSeries = new ListaSeries();
        listaSeries.adicionarSerieLeo("Suits");
        listaSeries.mostrarSeriesLeo();

        System.out.println();

        //Criando lista de filmes da Manu.
        ListaFilmesManuela listaFilmesManuela = new ListaFilmesManuela();
        listaFilmesManuela.adicionarFilmeManu("A pequena sereia");
        listaFilmesManuela.mostrarFilmesManu();
    }


}
