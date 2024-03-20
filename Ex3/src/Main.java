import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  static float VerificarSaldo(Scanner input, List<ContaBancaria> contas, int i){

    boolean verificador = false;
    float valor = 0;

    while(verificador == false){

      System.out.print("Informe o valor para sacar: ");
      valor = Float.parseFloat(input.nextLine());
  
      if(valor > contas.get(i).getSaldo())
        System.out.println("Valor maior que o saldo da conta! Digite novamente...");
      else
        verificador = true;

    }

    return valor;

  }

  static int VerificarConta(Scanner input, List<ContaBancaria> contas){

    int numConta = 0, i = 0;
    boolean verificadorConta = false;

    while(verificadorConta == false){

      System.out.print("Digite o número da conta: ");
      numConta = Integer.parseInt(input.nextLine());
  
      for(i = 0; i < contas.size(); i++){
        
        int verificador = contas.get(i).getNumConta();
  
        if(numConta == verificador){
          verificadorConta = true;
          break;
        }
  
      }

      if(verificadorConta == false){
        System.out.println("Conta inexistente! Digite novamente...\n\n");
      }

    }

    return i;

  }

  static void CadastrarConta(Scanner input, List<ContaBancaria> contas){
    
    System.out.print("\n\nDigite o número da conta: ");
    int numConta = Integer.parseInt(input.nextLine());

    System.out.print("Digite o nome do titular da conta: ");
    String nomeTitular = input.nextLine();

    contas.add(new ContaBancaria(numConta, nomeTitular));

  }

  static void SacarValor(Scanner input, List<ContaBancaria> contas){

    int indice;
    float valor;

    indice = VerificarConta(input, contas);
    valor = VerificarSaldo(input, contas, indice);
    contas.get(indice).SacarValor(valor);

  }

  static void DepositarValor(Scanner input, List<ContaBancaria> contas){
    int indice;
    float valor;

    indice = VerificarConta(input, contas);
    System.out.print("Digite o valor desejado para depositar: ");
    valor = Float.parseFloat(input.nextLine());

    contas.get(indice).DepositarValor(valor);

  }

  static void ListarConta(Scanner input, List<ContaBancaria> contas){
    int i = VerificarConta(input, contas);

    contas.get(i).ListarConta();
    
  }
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    List<ContaBancaria> contas = new ArrayList<ContaBancaria>();
    boolean menu = true;

    while(menu){

      System.out.println("\n\n[0] Finalizar programa");
      System.out.println("[1] Cadastrar nova conta");
      System.out.println("[2] Sacar");
      System.out.println("[3] Depositar");
      System.out.println("[4] Listar Conta");
      System.out.print("Opcao: ");
      String opcao = input.nextLine();

      switch(opcao){
        case "0":
        menu = false;
        System.exit(0);
        break;

        case "1": CadastrarConta(input, contas);
        System.out.println("\nPressione ENTER para continuar...");
        input.nextLine();
        break;

        case "2": SacarValor(input, contas);
        System.out.println("\nPressione ENTER para continuar...");
        input.nextLine();
        break;

        case "3": DepositarValor(input, contas);
        System.out.println("\nPressione ENTER para continuar...");
        input.nextLine();
        break;

        case "4": ListarConta(input, contas);
        System.out.println("\nPressione ENTER para continuar...");
        input.nextLine();
        break;
        
        default: System.out.println("\nOpçao Inválida! Digite novamente...");
        break;
      }

    }

    input.close();

  }

}
