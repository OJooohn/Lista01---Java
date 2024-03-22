import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  static void CadastrarLivro(List<Biblioteca> livros, Scanner input){

    System.out.print("Informe o nome do livro: ");
    String titulo = input.nextLine();

    System.out.print("Informe o nome do autor: ");
    String autor = input.nextLine();

    System.out.print("Informe o ano de publicaçao: ");
    int ano = Integer.parseInt(input.nextLine());

    livros.add(new Biblioteca(titulo, autor, ano));
    
  }

  static void ListarLivros(List<Biblioteca> livros){

    for(int i = 0; i < livros.size(); i++){
      livros.get(i).Imprimir();
    }

    return;

  }
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    List<Biblioteca> livros = new ArrayList<Biblioteca>();
    boolean menu = true;
    String opcao;

    while(menu){
      System.out.println("[1] Adicionar novo livro");
      System.out.println("[2] Listar livros");
      System.out.println("[0] Finalizar programa");
      System.out.print("Opçao: ");
      opcao = input.nextLine();

      switch(opcao) {
        case "0": System.exit(0);
        break;
        case "1": CadastrarLivro(livros, input);
        break;
        case "2": ListarLivros(livros);
        break;
      }
    }

    input.close();

  }
}
