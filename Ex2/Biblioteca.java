public class Biblioteca {
  
  String titulo;
  String autor;
  int ano;

  Biblioteca(String tit, String aut, int an){
    titulo = tit;
    autor = aut;
    ano = an;
  }

  void Imprimir(){
    System.out.println("\n\nTítulo: " + titulo);
    System.out.println("Autor: " + autor);
    System.out.println("Ano de publicaçao: " + ano);
  }

}
