import java.util.Scanner;


public class Main {

  static float verificarNumero(String texto){
    Scanner input = new Scanner(System.in);
    boolean verificador = false;
    float num = 0;
  
    while(verificador == false){
      System.out.print(texto);
      num = Float.parseFloat(input.nextLine());
  
      if(num == 0)
        System.out.println("\nNao existe divisao por zero! Digite outro número...");
      else
        verificador = true;
    }
  
    return num;
  
  }

  static void rodarCalculadora(){

    Scanner input = new Scanner(System.in);
    boolean verificadorOp = false;
    float num1, num2;
    String operacao = "", div = "/";

    while(verificadorOp == false){
      System.out.print("Informe a operaçao da conta (+|-|*|/): ");
      operacao = input.nextLine();

      switch(operacao){
        case "+": verificadorOp = true;
        break;

        case "-": verificadorOp = true;
        break;

        case "*": verificadorOp = true;
        break;

        case "/": verificadorOp = true;
        break;
        
        default: System.out.println("Operador inválido! Digite novamente...");
      }
    }
    
    
    if(operacao.equals("/")){
      
      num1 = verificarNumero("Informe o número 1: ");
      num2 = verificarNumero("Informe o número 2: ");    
      
    } else {
      System.out.print("Informe o número 1: ");
      num1 = Float.parseFloat(input.nextLine());
      System.out.print("Informe o número 2: ");
      num2 = Float.parseFloat(input.nextLine());
    }
    
    Calculadora novoCalc = new Calculadora(num1, num2, operacao);
    novoCalc.imprimirResultado(num1, num2, operacao);

  }
  
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    boolean menu = true;
    String opcao;

    while(menu){
      System.err.println("[1] Realizar um Cálculo");
      System.out.println("[0] Finalizar programa");
      System.out.print("Opçao: ");
      opcao = input.nextLine();
      opcao = opcao.toLowerCase();

      switch(opcao){
        case "1": rodarCalculadora();
        break;

        case "0": System.exit(0);
        break;
      }
    }

  }

}
